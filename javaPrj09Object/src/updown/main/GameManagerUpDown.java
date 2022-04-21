package updown.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerUpDown {
	
	public final String gameName = "업다운";

	public void gameStart() {
		System.out.println(gameName + " 게임시작~~~~");
		
		//컴퓨터가 랜덤 숫자 하나 생각하게 하고
//		int randNum = (int) (Math.random()*100) +1;
		int r = new Random().nextInt(50);		//Random 클래스 사용하기		//아래 두줄과 동일한 코드
//		Random randomObject = new Random();
//		int r = randomObject.nextInt(50);
		
		//정수 하나 받고
		Scanner sc = new Scanner(System.in);
		
		//업다운 얘기해주고
		while(true) {
			int x = sc.nextInt();
			if(x>r) {
				System.out.println("Down");
			}else if(x<r) {
				System.out.println("Up");
			}else {
				System.out.println("정답입니다");
				break;
			}
		}
		
		
		//틀리면 맞출때까지 시도 하게하고
		//밎추면 정답입니다 출력 해주기
		
		
	}//gmaeStart()
	
	
	
	
	
	
	
}//class
