package StreemsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import overriding.Student;

public class StreemsArrayList {
	public static void main(String[] args) {

		// list

		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "sivakumari", 25000));
		student.add(new Student(2, "malliswari", 30000));
		student.add(new Student(3, "ramu", 10000));
		student.add(new Student(4, "lakshman", 15000));
		student.add(new Student(5, "priya", 23000));
		//student.add(new Student(5, "priya", 23000));
		//student.add(new Student(4, "lakshman", 15000));
		// get salary that is greater than 15000 find all salaries
		
		
		Collections.sort(student,Comparator.comparing(Student::getName));
		
		System.out.println("print salary greater than 15000");
		student.sort((e1,e7)->e1.getName().compareTo(e7.getName()));
		student.forEach(p->System.out.println(p.getName()+" "+p.getSalary()));
		
		
		student.stream().filter(e -> e.getSalary() > 15000).forEach(e -> System.out.println(e.getSalary()));

		// iterate list check whether the list contains ramu if it contains print the
		// salary of ramu
		System.out.println(
				"iterate list check whether the list contains ramu if it contains print the salary of ramu by using contains method");
		student.stream().filter(e -> e.getName().contains("ramu")).map(Student::getSalary)
				.forEach(e -> System.out.println(e));

		// iterate list check whether the list contains ramu if it contains print the
		// salary of ramu
		System.out.println(
				"iterate list check whether the list contains ramu if it contains print the salary of ramu by using equals method");
		student.stream().filter(e -> e.getName().equals("ramu")).map(Student::getId)
				.forEach(r -> System.out.println(r));

		// store the salary which is greater than 15000
		student.stream().filter(e -> e.getSalary() > 10000).forEach(e -> System.out.println(e.getName()));

		System.out.println("***********");
		System.out.println("get salary more than 15000 store that details into a list");
		List<Student> stu = student.stream().filter(e -> e.getSalary() > 15000).collect(Collectors.toList());
		for (Student s : stu) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getSalary());
		}

		System.out.println("**************");
		System.out.println("count number of objects present in list");
		System.out.println(student.stream().count());

		System.out.println("**************");
		System.out.println("find min salary");
		Student s = student.stream().min((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).get();
		System.out.println(s.getSalary());

		System.out.println("find max salary");
		Student s1 = student.stream().max((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).get();
		System.out.println(s1.getSalary());

		System.out.println("find sum salary");
		Integer sum = student.stream().map(Student::getSalary).reduce(Integer::sum).get();
		System.out.println(sum);

		System.out.println("find max salary");
		Integer i = student.stream().map(e -> e.getSalary()).reduce(Integer::max).get();
		System.out.println(i);

		System.out.println("find min salary");
		Integer i12 = student.stream().map(e -> e.getSalary()).reduce(Integer::min).get();
		System.out.println(i12);

		System.out.println("convert salary to array");

		int[] a = student.stream().mapToInt(e -> e.getSalary()).toArray();
		for (int i1 : a) {
			System.out.println(i1);

		}

		System.out.println("sort salary by decending");
		List<Student> stud = student.stream()
				.sorted((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : e1.getSalary() < e2.getSalary() ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(stud);

		System.out.println("sorting order");
		List<Student> stud1 = student.stream().sorted((s3, s2) -> s3.getSalary()-s2.getSalary())
				.collect(Collectors.toList());
		System.out.println(stud1);

		System.out.println("salary in sorted order");
		student.stream().sorted((e1, e2) ->e1.getName().compareTo(e2.getName())).forEach(e -> System.out.println(e));

		System.out.println("********");
		Integer g = Stream.of(10, 20, 30, 14).reduce(Integer::sum).get();
		System.out.println(g);

		System.out.println("********");
		Integer g1 = Stream.of(10, 20, 24, 30).reduce(Integer::min).get();
		System.out.println(g1);

		System.out.println("***********");
		Integer g2 = Stream.of(10, 20, 24, 30).reduce(Integer::max).get();
		System.out.println(g2);

		System.out.println("distinct names");
		// distinct is used to fetch distinct names
		student.stream().map(e -> e.getName()).distinct().forEach(e -> System.out.println(e));
		
		List<Integer> l=Arrays.asList(10,34,12,56,78);
		l.stream().sorted((e2,e3)->-e2.compareTo(e3)).forEach(e->System.out.println(e));
		
		
		//limit method
		System.out.println("limit method");
		student.stream().limit(2).forEach(e->System.out.println(e));
		
		//skip method
		System.out.println("skip method");
		student.stream().skip(3).forEach(e->System.out.println(e));
		
		
		//group by
		System.out.println("group by");
		Map<Integer, Long> g3=student.stream().collect(Collectors.groupingBy(Student::getSalary,Collectors.counting()));
		System.out.println(g3);
		
		
		System.out.println("sorting by using cmparator");
		student.stream().sorted(Comparator.comparing(Student::getSalary).reversed()).forEach(e->System.out.println(e));

		
		System.out.println("***********");
		IntSummaryStatistics sum1=student.stream().collect(Collectors.summarizingInt(a1->a1.getSalary()));
		System.out.println(sum1.getCount());
		System.out.println(sum1.getMax());
		System.out.println(sum1.getAverage());
		System.out.println(sum1.getMin());
		System.out.println(sum1.getSum());
		
		System.out.println("*********");
		String s3=student.stream().filter(e->e.getId()==1).map(e->e.getName()).collect(Collectors.joining());
		System.out.println(s3);
		Map<Object,Long> sr=Arrays.stream(s3.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(sr);
		
		
		Double d=student.stream().collect(Collectors.averagingInt(e->e.getSalary()));
		System.out.println(d);
		
		
		
		Set<Student> set=student.stream().collect(Collectors.toSet());
		set.stream().forEach(e->System.out.println(e));
		
		System.out.println("************");
		int listcount=(int) student.stream().count();
		int setcount=(int) set.stream().count();
		System.out.println(listcount-setcount);
		
		
		System.out.println("********");
		Map<Integer,String> ma=student.stream().collect(Collectors.toMap(e->e.getSalary(), e->e.getName()));
		System.out.println(ma);
		
	}

}
