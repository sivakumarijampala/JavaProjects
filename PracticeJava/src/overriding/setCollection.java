package overriding;

import java.util.HashSet;
import java.util.Set;

public class setCollection {
	public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	set.add(10);
	set.add(20);
	set.add(10);
	set.add(10);
	System.out.println(set);
	
	}

}
