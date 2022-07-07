package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public void test01() {
		List x = new ArrayList();
		
		x.add("one");
		x.add("apple");
		x.add("banana");
		
//		x.clear();
//		x.add(0, "zzz");
//		x.add(7, "hello");
//		boolean result = x.contains("apple");
//		System.out.println(result);
//		x.isEmpty();
		
		
		
		
		System.out.println(x.get(0));
		System.out.println(x.get(1));
		System.out.println(x.get(2));
	}//test01

}//class
