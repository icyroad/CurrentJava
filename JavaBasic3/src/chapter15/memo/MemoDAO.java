package chapter15.memo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DAO : Data Access Object (데이터베이스만 담당하는 객체)
public class MemoDAO {
	public List<MemoVO> selectAll() throws Exception {
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		//select 문장은 executeQuery를 사용하고
		ResultSet resultSet = statement.executeQuery("SELECT NO, WRITER, CONTENTS, REGISTER_DATE, MODIFY_DATE FROM MEMO ORDER BY NO ");
		while (resultSet.next()) {
			int no = resultSet.getInt("no");
			String writer = resultSet.getString("writer");
			String contents = resultSet.getString("contents");
			Timestamp registerDate = resultSet.getTimestamp("register_date");
			Timestamp modifyDate = resultSet.getTimestamp("modify_date");
			list.add(new MemoVO(no, writer, contents, registerDate.toLocalDateTime(), Objects.nonNull(modifyDate)? modifyDate.toLocalDateTime() : null));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());//동작은 똑같은데 개발자가쓰기에 얘가 편하다 에러는 쓰로우할것.
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		// insert, update, delete : executeUpdate()를 사용한다.
		
		int executeUpdate = statement.executeUpdate("INSERT INTO MEMO (NO, WRITER, CONTENTS) VALUES (MEMO_SEQ.NEXTVAL, '" + vo.getWriter() + "', '" + vo.getContents() + "')");
		statement.close();
		connection.close();
		return executeUpdate;
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());//동작은 똑같은데 개발자가쓰기에 얘가 편하다 에러는 쓰로우할것.
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");

		StringBuilder builder = new StringBuilder(); // 얘랑 StringBuffer(얘는 스레드에 안전); 문자열을 빌드할수있는? 연결해 줄 수 있는 기능
		builder.append("UPDATE memo ");				// sql에서 ctrl F7 누르면 정렬되는데 그걸 복사해와서 alt shift a 누르고 드래그 한 뒤 붙여넣는다.
		builder.append("    SET ");					//붙여넣기 한거에 오류나지않게 각 줄마다 공백을 추가해줘라
		builder.append("        contents = ?, ");
		builder.append("        modify_date = SYSDATE ");
		builder.append("WHERE ");
		builder.append("    no = ? ");
		//prepareStatement 사용할거기 때문에 들어가야할 값 자리에 ?를 넣는다.
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		// prepareStatement 먼저 쿼리를 만들고 그다음에 값을 넣는 방식
		statement.setString(1, vo.getContents());
		statement.setInt(2, vo.getNo());
		
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}
}
