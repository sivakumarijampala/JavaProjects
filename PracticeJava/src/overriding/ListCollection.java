package overriding;

import java.util.ArrayList;

public class ListCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println(list);
		
		System.out.println("adding element at first position");
		list.add(0,150);
		System.out.println(list);
	}

}
