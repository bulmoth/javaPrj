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
//			1. 문자열 하나 만들기
		String s = "Hello World! I'm Omega Alpha";
		System.out.println(s);
//			2. n번째 문자 출력하기
		int n = 5;
		System.out.println(s.substring(n));
//			3. n번째 부터 m 번째 문자열 출력하기
		int m = 7;
		System.out.println(s.substring(n, m));
//			4. "hello" 라는 문자열과 같은지 확인하기
		System.out.println(s.equals("hello"));
		"hello".equals(s);		//이게 좀더 바람직, NullPointException이 발생할 수 있기 때문에. 리터럴(실제 문자열)과 비교할 땐 리터럴을 앞에다가 써야함.
//			5. "abc" 라는 문자열을 포함하고 있는지 확인하기
		System.out.println(s.contains("abc"));
//			6. 해당 문자열이 가지는 특정 문자의 인덱스 값 알아내기
		System.out.println(s.indexOf("A"));
//			7. 특정 문자열을 구분자로 하여 문자배열 얻어내기
		String[] sa = s.split(" ");

		for(String x : sa) {
			System.out.println(x);
		}
//			<List>
//			1. List 타입 객체 생성
//		List l = new ArrayList();
//			2. 문자열만 담을 수 있도록 제한
		List<String> l = new ArrayList<String>();
//			3. 연예인 이름 n명 넣기
		l.add("초코보");
		l.add("모그리");
		l.add("카벙클");
		l.add("톤베리");
		l.add("펜리르");
//			4. 모든 연예인 이름 출력해보기 (반복문으로)
		for(String x : l) {
			System.out.println(x);
		}
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("=========");
//			5. 그 중 3번째 연예인 이름 출력해보기
		System.out.println(l.get(2));
		System.out.println("=========");
//			6. 마지막(뒤에서 첫번째) 연예인 이름 출력해보기
		System.out.println(l.get(l.size()-1));
		System.out.println("=========");
//			7. 뒤에서 두번째 연예인 이름 삭제하기
		l.remove(l.size()-2);
		for(String x : l) {
			System.out.println(x);
		}
		System.out.println("=========");
//			<Set>
//			1. Set 타입 객체 생성
//			2. 정수만 들어가도록 제한하기
		Set<Integer> si = new HashSet<Integer>();
//			3. 10개의 정수 넣기
		for(int i = 0; i<10; i++) {
			si.add(i);
		}
//			4. 모든 값 출력해보기
		System.out.println(si);
		
		Iterator<Integer> iter = si.iterator();
//		while(true) {
//			if(!iter.hasNext()) {
//				break;
//			}
//			if(iter.hasNext()) {
//				//iter 에서 요소 꺼내옴
//				int result = iter.next();
//				System.out.println(result);
//			}
//		}
		while(iter.hasNext()) {	//iter야 요소 가지고있니
			int result = iter.next();	//iter야 요소 내놓아라(삭제함)
			System.out.println(result);
		}
		
//			5. 정수 n이 해당 객체에 포함되어 있는지 확인해보기
		System.out.println(si.contains(n));
//			<Map>
//			1. Map 타입 객체 생성
//			2. Map 의 key는 문자열, value는 정수 로 제한하기
		Map<String, Integer> hm = new HashMap<String, Integer>();
//			3. Map 에 5개의 문자열-정수 쌍 데이터 넣기
		hm.put("first", 2);
		hm.put("second", 4);
		hm.put("third", 6);
		hm.put("fourth", 8);
		hm.put("fifth", 10);
//			4. 특정 key로 value 꺼내서 출력해보기
		System.out.println(hm.get("fourth"));
//			5. 모든 키 값 확인해보기 (출력)
		System.out.println(hm.keySet());
		Iterator<String> ir = hm.keySet().iterator();
		while(ir.hasNext()) {
			String k = ir.next();
		}
//			6. 모든 value 확인해보기 (출력)
		System.out.println(hm.values());
//			7. 모든 key - value 쌍 확인해보기 (출력)
		System.out.println(hm.entrySet());
		 
		Set<Map.Entry<String, Integer>> es = hm.entrySet();	//Set의 제네릭이 Entry, Entry의 제네릭이 String/Integer
		Iterator<Entry<String, Integer>> it = es.iterator();	//Map.Entry 가 정확한 표현....
		
		while(it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.print(e.getKey() + " : ");
			System.out.println(e.getValue());
		}
		
		

	}

}
