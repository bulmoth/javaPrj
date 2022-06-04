package member;

import java.sql.Connection;

import util.JdbcTemplate;

public class MemberService {
	
	private Connection conn = JdbcTemplate.getConnection();

	public int join(MemberVo vo) {
		
		if(vo.getPwd().length() < 4) {
			//회원가입 실패
			return -1;
		}
		
		int dupResult = new MemberDao().checkDup(conn, vo.getId());
		if(dupResult>0) {
			//아이디 중복
			return -2;
		}
		
		if("admin".equals(vo.getId())) {
			//회원가입 실패
			return -2;
		}
		
		int result = new MemberDao().join(conn, vo);
		
		if(result == 1) {
			JdbcTemplate.commit(conn);
			System.out.println("커밋 완료");
		}else {
			JdbcTemplate.rollback(conn);
			System.out.println("롤백 완료");
		}
		return result;
		
	}
	
	

}
