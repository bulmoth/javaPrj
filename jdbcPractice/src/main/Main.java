package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		String id = "C##KH";
		String pwd = "KH";
		Connection conn = null;
		try {
			//드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(url, id, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println(conn);
		

	}

}
