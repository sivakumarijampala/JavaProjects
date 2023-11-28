
package overriding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapiteration {
	public static void main(String[] args) {
		
		
		//primitive types
		Map<Integer,String> map=new HashMap<>();
		map.put(100,"sivakumari");
		map.put(200,"malliswari");
		map.put(300,"ram");
		map.put(400,"lakshman");
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		map.put(400,"ramubrro");
		
		System.out.println("after entering duplicates");
		System.out.println("***************");
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		System.out.println("iterating elements by using iterator");
		Iterator<Map.Entry<Integer,String>> iterate=map.entrySet().iterator();
		while(iterate.hasNext()) {
			Map.Entry<Integer, String> entry=iterate.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("iterating objects");
		//object types
		
		Map<Integer,Student> stu=new HashMap<>();
		stu.put(1,new Student(1,"swathi"));
		stu.put(2,new Student(2,"priya"));
		stu.put(3,new Student(3,"Bhavana"));
		stu.put(3,new Student(3,"hello"));
		for(Map.Entry<Integer,Student> en:stu.entrySet()) {
			System.out.println(en.getKey()+"--->"+en.getValue().id+","+en.getValue().name);
		}
		
		System.out.println("iterate elements by using iterator");
		Iterator<Map.Entry<Integer,Student>> stu1=stu.entrySet().iterator();
		while(stu1.hasNext()) {
			Map.Entry<Integer,Student> s=stu1.next();
			System.out.println(s.getKey()+" "+s.getValue().id+""+s.getValue().name);
			
		}
		
	}

}
