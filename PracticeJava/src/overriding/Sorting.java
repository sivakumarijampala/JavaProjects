package overriding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"siva",21000));
		l.add(new Student(2,"kumari",10000));
		l.add(new Student(3,"pavan",25000));
		l.add(new Student(4,"shiv",230000));
		
		Collections.sort(l);
		
		System.out.println("sorting by using comparable");
		for(Student s:l) {
			System.out.println(s.getId()+","+s.getName()+","+s.getSalary());
		}
		
		System.out.println("********");
		System.out.println("sorting by using comparator");
		Collections.sort(l,new SortByComparator());
		for(Student s:l) {
			System.out.println(s.getId()+","+s.getName()+","+s.getSalary());
		}
		

	}

}
