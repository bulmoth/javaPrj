package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
	
	public void test01() {
		Map m = new HashMap();
		
		m.put("������", 3000);
		m.put("ũ��Ű", 1000);
		m.put("���ĸ�", 1500);
		m.put("����", 1200);
		
		Set<String> s = m.keySet();
		for(String temp : s) {
			System.out.println(temp);
		}
		
		System.out.println(m);
	}//test01

}//class
