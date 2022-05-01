package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
	
	Person p1 = new Person("tlsguswl", 26, 'F');
	Person p2 = new Person("tlsguswl2", 26, 'F');
	Person p3 = new Person("tlsguswl3", 26, 'F');
	
	String s1 = "aaa";
	String s2 = "bbb";
	String s3 = "ccc";
	
	//List 
	public void testList() {
		
		//ArrayList
//		ArrayList al = new ArrayList();
//		al.add(p1);
//		al.add(p2);
//		al.add(p3);
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		
//		System.out.println(al.get(0));
//		System.out.println(al.get(2));
//		System.out.println(al.get(5));
		
		//LinkedList
//		LinkedList list = new LinkedList();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
		
		//Person, String 여러개를 한번에 관리...할 수 있는 방법이 예전에도 있었지...
		//여러개? 배열...
		Object[] oArr = new Object[6];
		oArr[0] = p1;
		oArr[1] = p2;
		oArr[2] = p3;
		oArr[3] = s1;
		oArr[4] = s2;
		oArr[5] = s3;
		for(Object x : oArr) {
			System.out.println(x);
		}
		
	}
	
	//Set
	public void testSet() {
		//HashSet
		//생성, 넣기, 꺼내기
		HashSet hs = new HashSet();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
	}
	
	//Map
	public void testMap() {
		
		//생성
		HashMap map = new HashMap();
		
		//넣기
		map.put("first", p1);
		map.put("second", p2);
		map.put("third", p3);
		
		//꺼내기
		System.out.println(map.get("first"));
	}
	
	//Stack
	public void testStack() {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		Object x1 = s.pop();
		Object x2 = s.pop();
		Object x3 = s.pop();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
	
	//Queue
	public void testQueue() {
		Queue q = new LinkedList();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
		Object x0 = q.peek();	//맨 첫번째거를 삭제하지 않고서 확인
		System.out.println(x0);
		
		q.remove();		//맨 첫번째거 삭제
		
		Object x1 = q.poll();
		Object x2 = q.poll();
		Object x3 = q.poll();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
	
	
	
	
	
	
	
	
	
	
}//class
