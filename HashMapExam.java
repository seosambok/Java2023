package s0828;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map = new HashMap<>();
		map.put(20313, "서준민");		
		map.put(20302, "구예성");		
		map.put(20304, "깜동현");		
		map.put(20306, "시개미");
		
		System.out.println(map.toString());
		System.out.println(map.size());
		
		System.out.println(map.get(20302));
		map.put(20306,"김로봇");
		System.out.println(map.toString());
		
		for (Integer a: map.keySet()) {
			System.out.println(a);
		}
		for (String s : map.values()) {
			System.out.println(s);
		}
		
		for (Integer a : map.keySet()) {
			System.out.print("학번:" + a);
			System.out.println(" 이름:"+ map.get(a));
		}
		
		map.remove(20306);
		map.clear();
		System.out.println(map.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
