package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public void test01() {
		Set<String> s = new HashSet();
		
		s.add("��");
		s.add("ȭ");
		s.add("��");
		s.add("��");
		s.add("��");
		s.add("��");
		s.add("��");
		s.add("��");
		
		for(String temp : s) {
			System.out.println(temp);
		}
		
		System.out.println(s);
		
	}
}
