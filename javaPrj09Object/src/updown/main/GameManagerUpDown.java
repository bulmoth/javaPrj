package updown.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerUpDown {
	
	public final String gameName = "���ٿ�";

	public void gameStart() {
		System.out.println(gameName + " ���ӽ���~~~~");
		
		//��ǻ�Ͱ� ���� ���� �ϳ� �����ϰ� �ϰ�
//		int randNum = (int) (Math.random()*100) +1;
		int r = new Random().nextInt(50);		//Random Ŭ���� ����ϱ�		//�Ʒ� ���ٰ� ������ �ڵ�
//		Random randomObject = new Random();
//		int r = randomObject.nextInt(50);
		
		//���� �ϳ� �ް�
		Scanner sc = new Scanner(System.in);
		
		//���ٿ� ������ְ�
		while(true) {
			int x = sc.nextInt();
			if(x>r) {
				System.out.println("Down");
			}else if(x<r) {
				System.out.println("Up");
			}else {
				System.out.println("�����Դϴ�");
				break;
			}
		}
		
		
		//Ʋ���� ���⶧���� �õ� �ϰ��ϰ�
		//�G�߸� �����Դϴ� ��� ���ֱ�
		
		
	}//gmaeStart()
	
	
	
	
	
	
	
}//class
