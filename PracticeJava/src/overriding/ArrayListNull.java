package overriding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListNull {
	public static void main(String[] args) {
		List li=new ArrayList<>();
		li.add(null);
		li.add(null);
	    System.out.println(li);
	    
	    List li1=new LinkedList<>();
	    li1.add(null);
	    li1.add(null);
	    System.out.println(li1);
		
	}

}
