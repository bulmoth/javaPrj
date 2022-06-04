package member;

import util.Util;

public class MemberController {

	public void join() {
		
		System.out.println("===== 회원가입 =====");
		System.out.print("아이디 : ");
		String id = Util.sc.nextLine();
		
		System.out.print("패스워드 : ");
		String pwd = Util.sc.nextLine();
		
		System.out.print("닉네임 : ");
		String nick = Util.sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = Util.sc.nextLine();
		
		System.out.print("성별 : ");
		String gender = Util.sc.nextLine();
		
		MemberVo vo = new MemberVo(id, pwd, nick, phone, gender);
		
		int result = new MemberService().join(vo);
		
		if(result == 1) {
			System.out.println("회원가입 성공 !");
		}else if(result == -1) {
			System.out.println("비밀번호는 4글자 이상이어야 합니다.");
		}else if(result == -2) {
			System.out.println("다른 아이디를 입력해주세요.");
		}else {
			System.out.println("회원가입 실패 ..");
		}
		
	}

	public void login() {
		
		System.out.println("===== 로그인 =====");
		
	}

	public void edit() {
		
		System.out.println("===== 회원정보수정 =====");
		
	}

	public void quit() {
		
		System.out.println("===== 탈퇴 =====");
		
	}
	
	

}
