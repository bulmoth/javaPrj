package member;

import java.sql.Connection;

import util.JdbcTemplate;

public class MemberService {
	
	private Connection conn = JdbcTemplate.getConnection();

	public int join(MemberVo vo) {
		
		if(vo.getPwd().length() < 4) {
			//ȸ������ ����
			return -1;
		}
		
		int dupResult = new MemberDao().checkDup(conn, vo.getId());
		if(dupResult>0) {
			//���̵� �ߺ�
			return -2;
		}
		
		if("admin".equals(vo.getId())) {
			//ȸ������ ����
			return -2;
		}
		
		int result = new MemberDao().join(conn, vo);
		
		if(result == 1) {
			JdbcTemplate.commit(conn);
			System.out.println("Ŀ�� �Ϸ�");
		}else {
			JdbcTemplate.rollback(conn);
			System.out.println("�ѹ� �Ϸ�");
		}
		return result;
		
	}
	
	

}
