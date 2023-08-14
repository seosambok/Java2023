package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		System.out.println("Hello");
	
		ArrayList<String>list = new ArrayList<>();
		
		list.add("서준민");
		list.add("유재석");
		list.add("김재우");
		list.add("서준민");
		list.add("이승재");
		System.out.println(list.toString());
		list.remove("유재석");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("-----------------");
		for (String s : list) {
			System.out.println(s);
			
		list.removeAll(list);
		list.clear();
		System.out.println("지운후 사이즈"+list.size());
		}
		
		list.add("서울");
		list.add("로봇");
		if(list.contains("서울")==true) {
			System.out.println("서울을 포함하고 있음");
		}
	}

}
