package s0814;

import java.util.LinkedList;
public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("구예성");
		list.add("권순호");
		list.add("김동현");
		System.out.println(list);
		
		System.out.println(list.toString());
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.addFirst("김기훈");
	}

}
