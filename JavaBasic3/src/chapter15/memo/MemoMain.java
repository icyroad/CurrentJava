package chapter15.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemoMain {
	public MemoMain() throws Exception {
		//CRUD : Create(insert), Read(select), Update, Delete (읽고 쓰고 수정하고 삭제하는 하나의 서비스 단위랄까?)
		// select One, select All (하나만 조회하는거, 전부 다 조회하는거)
		//insert, update, delete  (만들기, 수정하기, 삭제하기)
		//메모 데이터 조회
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT NO, WRITER, CONTENTS, REGISTER_DATE, MODIFY_DATE FROM MEMO;");
		while (resultSet.next()) {
			int no = resultSet.getInt("NO");
			String writer = resultSet.getString("WRITER");
			String contents = resultSet.getString("CONTENTS");
			Date registerDate = resultSet.getDate("REGISTER_DATE");
			Date modityDate = resultSet.getDate("MODIFY_DATE");
			
			System.out.printf("%d \t %s \t %s \t %s \t %s\n", no, writer,contents, registerDate, modityDate);
			
		}
		resultSet.close();
		statement.close();
		connection.close();
	}
}
