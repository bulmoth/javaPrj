package com.swy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDB {
	
	public static Connection getOracleConnection() {
		
		//파일에다가 ip, port, url 이런 연결 정보들을 저장
		//파일에서 읽어들여서 연결
		//당연히, 파일은 각자 본인 환경에 맞게 가지고 있으면 됨
		//파일은 깃허브에 올리면 안됨...->깃 이그노어
		
		//사전준비
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	//ip, port 본인에 맞게
		String id = "C##KH";
		String pwd = "KH";
		
		//드라이버 등록
		Connection conn = null;
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("커넥션 가져오기 실패");
		}
		
		return conn;
		
	}
	
	public static void close(Connection conn) {
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Statement stmt) {
		if(stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}//class
