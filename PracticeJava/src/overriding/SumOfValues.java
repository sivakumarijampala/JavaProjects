package overriding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SumOfValues {
	public static void main(String[] args) {
		
		
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		
		Map<Integer,Integer> map=new HashMap<>();
		
		map.put(1,10);
		map.put(2,20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, null);
		map.put(6, null);
		map.put(null, null);
		map.put(7, 67);
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			//sum=sum+entry.getValue();
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
		
		/*
		 * Set<Integer> s=map.keySet(); for(int key:s) { sum1=sum1+map.get(key); }
		 * 
		 * for(int i1:map.keySet()) {
		 * 
		 * sum2=sum2+map.get(i1); }
		 * 
		 * System.out.println(sum); System.out.println(sum1); System.out.println(sum2);
		 * 
		 * System.out.println("by using streems sum of values");
		 * 
		 * int sum4=map.values().stream().reduce(0,Integer::sum);
		 * System.out.println(sum4);
		 * 
		 * int sum5=map.entrySet().stream().mapToInt(e->e.getValue()).sum();
		 * System.out.println(sum5);
		 * 
		 * int sum6=map.keySet().stream().mapToInt(key->map.get(key)).sum();
		 * System.out.println(sum6);
		 */
	
	}

}
