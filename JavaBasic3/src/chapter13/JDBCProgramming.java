package chapter13;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception {
		// JDBC: 자바와 데이터베이스와의 만남
		//개발의 기본이 되는 것이니 외우면 좋고, 최소한 흐름이라도 파악하자
		//0. JDBC Driver가 필요
		//드라이버 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. 접속(접속 정보가 필요 : 아이디, 비밀번호, 접속할 DB)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		
		//2. 쿼리를 작성할 워크시트를 만든다.
		Statement statement = connection.createStatement();
		
		//3. 쿼리를 작성하고 실행
		ResultSet resultSet = statement.executeQuery("SELECT MEM_ID, MEM_NAME, MEM_HP, MEM_MAIL, MEM_BIR FROM MEMBER");
		
		//4. 결과를 화면에 표시
		while (resultSet.next()) {
			String memId = resultSet.getString("MEM_ID");
			String memName = resultSet.getString("MEM_NAME");
			String memHp = resultSet.getString("MEM_HP");
			String memMail = resultSet.getString("MEM_MAIL");
			Date memBir = resultSet.getDate("MEM_BIR");
			System.out.printf("%s \t %s \t %s \t %s \t %s \n", memId, memName, memHp, memMail, memBir);
		}
		//5. 종료
		resultSet.close();
		statement.close();
		connection.close();
	}
}
