package overriding;

import java.util.ArrayList;
import java.util.List;

public class AddingIntegers {
	 public static void main(String[] args) {
	        List li = new ArrayList();
	   
	        li.add(10);
	        li.add(20);
	        li.add(30);
	        li.add("P");
	        li.add(49.56);
	        li.add("siva");
	        //li.add(45.6788);
	        li.add(10);
	         
	        double sum=0;
	        for(Object i :li) {
	        	if(i instanceof Number) {
	        		sum+=((Number)i).doubleValue();
	        	}	
	        }
	        System.out.println("sum is:"+sum);
	       
	        
	        int sum1=0;
	        for(Object i1:li) {
	        	if(i1 instanceof Integer) {
	        		sum1=sum1+((Integer)i1).intValue();
	        		
	        	}
	        }
	        System.out.println(sum1);

	    }

//	    public static void addIfInteger(List<Integer> list, Object value) {
//	        if (value instanceof Number) {
//	            list.add((Number) value);
//	        }
//	    }
	}
	




    
