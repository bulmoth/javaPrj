package com.swy.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.swy.db.OracleDB;
import com.swy.util.MyUtil;

public class Member {
	
	public static int loginUserNo;
	
	//로그인
	public boolean login() {
		System.out.println("=====로그인======");
		System.out.print("아이디 : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("패스워드 : ");
		String pwd = MyUtil.sc.nextLine();
		
		//디비 연결 얻기
		Connection conn = OracleDB.getOracleConnection();
		//해당 아이디에 맞는 패스워드 디비에서 조회하기
		String sql = "SELECT NO, PWD FROM MEMBER WHERE ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {		//커서 움직이기
				String dbPwd = rs.getString("PWD"); 	//해당 row의 몇번째(여기서는 1번째) 칼럼인지....칼럼명 써도 됨
				int no = rs.getInt("NO");		//칼럼명으로 조회시, 대소문자 상관 없음
				if(dbPwd.equals(pwd)) {
					//로그인 성공
					loginUserNo = no;
					System.out.println("로그인 성공!!!");
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생 !!!");
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
			OracleDB.close(rs);
		}
		//디비에서 조회한 패스워드가 일치하는지 확인
		
		System.out.println("로그인 실패...");
		return false;
	}
	
	//회원가입
	/*
	 * 아이디, 비번, 닉네임 입력받기
	 * 아이디 중복 검사
	 * 비밀번호 유효성 검사(8글자 이상...이런거)
	 * 디비에 저장
	 */
	public boolean join() {
		System.out.println("=====회원가입=====");
		System.out.print("아이디 : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = MyUtil.sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = MyUtil.sc.nextLine();
		
		//비번 유효성 검사
		if(pwd.length() < 4) {
			//회원가입 실패
			System.out.println("비밀번호는 4글자 이상이어야 합니다.");
			return false;
		}
		
		//아이디 중복 검사
		
		//1. 디비 접속
		Connection conn = OracleDB.getOracleConnection();
		//2. 디비에서 현재 아이디와 일치하는 아이디 조회
		try {
			//자바에서 날리는건 세미콜론 쓰면 안됨....
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";	
//			Statement stmtDup = conn.createStatement();
//			ResultSet rs = stmtDup.executeQuery(sql);
			PreparedStatement pstmt =  conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//중복된 아이디...회원가입 실패
				System.out.println("아이디 중복!!");
				return false;
			}
			
			//~~회원가입 로직~~
			//3 회원가입 성공? 디비 저장
			String sqlInsert 
			= "INSERT INTO MEMBER(NO,ID,PWD,NICK) "
					+ "VALUES(MEMBER_NO_SEQ.NEXTVAL, ?, ?, ?)";
//			Statement stmtInsert = conn.createStatement();
//			int result = stmtInsert.executeUpdate(sqlInsert);
			PreparedStatement pstmt2 =  conn.prepareStatement(sqlInsert);
			pstmt2.setString(1, id);
			pstmt2.setString(2, pwd);
			pstmt2.setString(3, nick);
			int result = pstmt2.executeUpdate();
			
			if(result == 1) {
				System.out.println("회원가입 성공!!");
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("회원가입 실패...");
		return false;

	}

}//class
