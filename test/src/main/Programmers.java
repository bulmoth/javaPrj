package main;

import java.util.*;

public class Programmers {
	
	public int[] solution1(int[] arr) {		//제일 작은 수 제거하기
//        int[] answer = {};
        List<Integer> l = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i : arr) {
        	l.add(i);
        }
        l.sort(Comparator.naturalOrder());
        int last = ((LinkedList<Integer>)l).pop();
        if(l.size() == 0) {
        	int[] answer = {-1};
        	return answer;
        }
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] != last) {
        		al.add(arr[i]);
        	}
        }
        int[] answer = new int[al.size()];
        answer = al.stream().mapToInt(i->i).toArray();
        if(answer[0] == 0 && answer.length <= 1) {
        	answer[0] = -1;
        }
        
        return answer;
    }//solution 1
	
	
	public long solution2(long n) {		//정수 제곱근 판별
        long answer = 0;
        
        double tmp1 = (double) n;
        tmp1 = Math.sqrt(tmp1);
        double tmp2 = Math.ceil(tmp1);
        if(tmp1 - tmp2 == 0) {
        	answer = (long)(Math.pow(tmp1 + 1, 2));
        }else {
        	answer = -1;
        }
        
        return answer;
    }//solution 2
	
	public long solution3(long n) {		//정수 내림차순으로 배치하기
        long answer = 0;
        
        LinkedList<Long> l = new LinkedList<>();
        long deci = 10;
        long tmp = n;
        while(tmp != 0) {
        	long cut = tmp%deci;
        	l.add(cut); 
        	tmp = (tmp-cut)/deci;
        }
        
        l.sort(Comparator.naturalOrder());
        
        long tmp2 = 0;
        while(answer < n*10) {
        	tmp2 = l.pop();
        	answer += tmp2*deci;
        	deci *= 10;
        }
        answer /= 10;
        return answer;
    }//solution 3
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
