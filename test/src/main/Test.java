package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
//		  <String>
//			1. ���ڿ� �ϳ� �����
		String s = "Hello World! I'm Omega Alpha";
		System.out.println(s);
//			2. n��° ���� ����ϱ�
		int n = 5;
		System.out.println(s.substring(n));
//			3. n��° ���� m ��° ���ڿ� ����ϱ�
		int m = 7;
		System.out.println(s.substring(n, m));
//			4. "hello" ��� ���ڿ��� ������ Ȯ���ϱ�
		System.out.println(s.equals("hello"));
		"hello".equals(s);		//�̰� ���� �ٶ���, NullPointException�� �߻��� �� �ֱ� ������. ���ͷ�(���� ���ڿ�)�� ���� �� ���ͷ��� �տ��ٰ� �����.
//			5. "abc" ��� ���ڿ��� �����ϰ� �ִ��� Ȯ���ϱ�
		System.out.println(s.contains("abc"));
//			6. �ش� ���ڿ��� ������ Ư�� ������ �ε��� �� �˾Ƴ���
		System.out.println(s.indexOf("A"));
//			7. Ư�� ���ڿ��� �����ڷ� �Ͽ� ���ڹ迭 ����
		String[] sa = s.split(" ");

		for(String x : sa) {
			System.out.println(x);
		}
//			<List>
//			1. List Ÿ�� ��ü ����
//		List l = new ArrayList();
//			2. ���ڿ��� ���� �� �ֵ��� ����
		List<String> l = new ArrayList<String>();
//			3. ������ �̸� n�� �ֱ�
		l.add("���ں�");
		l.add("��׸�");
		l.add("ī��Ŭ");
		l.add("�溣��");
		l.add("�渮��");
//			4. ��� ������ �̸� ����غ��� (�ݺ�������)
		for(String x : l) {
			System.out.println(x);
		}
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("=========");
//			5. �� �� 3��° ������ �̸� ����غ���
		System.out.println(l.get(2));
		System.out.println("=========");
//			6. ������(�ڿ��� ù��°) ������ �̸� ����غ���
		System.out.println(l.get(l.size()-1));
		System.out.println("=========");
//			7. �ڿ��� �ι�° ������ �̸� �����ϱ�
		l.remove(l.size()-2);
		for(String x : l) {
			System.out.println(x);
		}
		System.out.println("=========");
//			<Set>
//			1. Set Ÿ�� ��ü ����
//			2. ������ ������ �����ϱ�
		Set<Integer> si = new HashSet<Integer>();
//			3. 10���� ���� �ֱ�
		for(int i = 0; i<10; i++) {
			si.add(i);
		}
//			4. ��� �� ����غ���
		System.out.println(si);
		
		Iterator<Integer> iter = si.iterator();
//		while(true) {
//			if(!iter.hasNext()) {
//				break;
//			}
//			if(iter.hasNext()) {
//				//iter ���� ��� ������
//				int result = iter.next();
//				System.out.println(result);
//			}
//		}
		while(iter.hasNext()) {	//iter�� ��� �������ִ�
			int result = iter.next();	//iter�� ��� �����ƶ�(������)
			System.out.println(result);
		}
		
//			5. ���� n�� �ش� ��ü�� ���ԵǾ� �ִ��� Ȯ���غ���
		System.out.println(si.contains(n));
//			<Map>
//			1. Map Ÿ�� ��ü ����
//			2. Map �� key�� ���ڿ�, value�� ���� �� �����ϱ�
		Map<String, Integer> hm = new HashMap<String, Integer>();
//			3. Map �� 5���� ���ڿ�-���� �� ������ �ֱ�
		hm.put("first", 2);
		hm.put("second", 4);
		hm.put("third", 6);
		hm.put("fourth", 8);
		hm.put("fifth", 10);
//			4. Ư�� key�� value ������ ����غ���
		System.out.println(hm.get("fourth"));
//			5. ��� Ű �� Ȯ���غ��� (���)
		System.out.println(hm.keySet());
		Iterator<String> ir = hm.keySet().iterator();
		while(ir.hasNext()) {
			String k = ir.next();
		}
//			6. ��� value Ȯ���غ��� (���)
		System.out.println(hm.values());
//			7. ��� key - value �� Ȯ���غ��� (���)
		System.out.println(hm.entrySet());
		 
		Set<Map.Entry<String, Integer>> es = hm.entrySet();	//Set�� ���׸��� Entry, Entry�� ���׸��� String/Integer
		Iterator<Entry<String, Integer>> it = es.iterator();	//Map.Entry �� ��Ȯ�� ǥ��....
		
		while(it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.print(e.getKey() + " : ");
			System.out.println(e.getValue());
		}
		
		

	}

}
