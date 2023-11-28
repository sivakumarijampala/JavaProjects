package overriding;

import java.util.LinkedList;

public class linkedListCollection {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(50);
		
		System.out.println(linkedList);
		System.out.println("adding element at middle position of linked list");
		linkedList.add(3,26);
		System.out.println("after adding element at middle position of linked list");
		System.out.println(linkedList);
		
		System.out.println(linkedList.size());
		int size=(linkedList.size())/2;
		System.out.println(size);
		linkedList.add(size,34);
		System.out.println("adding element at middle position");
		System.out.println(linkedList);
		
		System.out.println("using set methodto replace value");
		linkedList.set(1,100);
		System.out.println(linkedList);
		
		System.out.println("adding first position");
		linkedList.addFirst(200);
		System.out.println(linkedList);
		
		System.out.println("adding last position");
		linkedList.addLast(400);
		System.out.println(linkedList);
	}

}
