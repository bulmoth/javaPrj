package cafe.employee;

public class CounterEmp {

	//카운터 직원
	
	/*
	 * [카운터 직원]
	 * -닉네임			//데이터(변수)
	 * -시급 : 9천원		
	 * -주문받는 기능		//메소드
	 * -계산 기능
	 */
	
	public String nick;		//접근제한자에 의해 다른 클래스에서도 접근가능하게해짐
	public int money;
	
	public void order() {
		System.out.println("주문받기~~~~");
	}
	
	public void calc() {
		System.out.println("계산하기~~~~");
	}
	
	
	
	
	
	
}
