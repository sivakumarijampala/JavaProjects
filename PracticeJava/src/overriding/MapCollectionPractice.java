package overriding;

import java.util.Comparator;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class MapCollectionPractice {
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		Map<Integer,Student> entry=new HashMap<>();
		
		
		System.out.println(
		entry.containsValue(new Student(9,"pavan",340000)));
		System.out.println(entry.isEmpty());
		if(entry.isEmpty()) {
			entry.put(8,new Student(9,"pavan",340000));
		}
		
		entry.put(1,new Student(1,"siva",20000));
		entry.put(2, new Student(2, "kumari",32000));
		entry.put(2, new Student(2,"kumari",45000));
		//entry.put(null,new Student(4,"ghj",345670));
		
		for(Map.Entry<Integer,Student> m:entry.entrySet()) {
			System.out.println(m.getKey()+"--->"+m.getValue().getId()+","+m.getValue().getName()+","+m.getValue().getSalary());
		}
		
		for(Map.Entry<Integer,Student> m1:entry.entrySet()) {
			sum=sum+m1.getValue().getSalary();
		}
		System.out.println(sum);
		
		for(int key:entry.keySet()) {
			sum1=sum1+entry.get(key).getSalary();
			
		}
		System.out.println(sum1);
		
		
		for(int k:entry.keySet()) {
			if(entry.containsKey(2)) {
				//Student s=entry.get(1);
				System.out.println(entry.get(2).getId()+","+entry.get(2).getName()+","+entry.get(2).getSalary());
			}
		}
		
		System.out.println(entry.isEmpty());
		
		for(int k1:entry.keySet()) {
			if(entry.containsKey(1)) {
				System.out.println(entry.get(1).getId()+","+entry.get(1).getName()+","+entry.get(1).getSalary());
			
			}
			System.out.println(
					entry.get(1).getSalary());
		}
		
		System.out.println(entry.size());
		
		System.out.println(entry.remove(1));
		
		System.out.println("after removing");
		for(Map.Entry<Integer,Student> m:entry.entrySet()) {
			System.out.println(m.getKey()+"--->"+m.getValue().getId()+","+m.getValue().getName()+","+m.getValue().getSalary());
		}
		
		//entry.clear();
		
		System.out.println("after clear");
		for(Map.Entry<Integer,Student> m:entry.entrySet()) {
			System.out.println(m.getKey()+"--->"+m.getValue().getId()+","+m.getValue().getName()+","+m.getValue().getSalary());
		}
		
		entry.toString();
		
		System.out.println("sorting");
		entry.entrySet().stream().sorted(Comparator.comparingInt(e->((Entry<Integer, Student>) e).getValue().getSalary()).reversed()).forEach(k->System.out.println(k.getKey()+"---->"+k.getValue().getId()+","+k.getValue().getName()+","+k.getValue().getSalary()));
	}
	
	


}
