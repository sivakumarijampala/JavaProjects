package overriding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {

		
		
		// consumer interface has one method accept it does not return any value it take
		// one argument
		Consumer consumer = s -> System.out.println(s);
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		consumer.accept(a);

		
		
		// supplier--->it dont take any parameters it returns value
		Supplier supplier = () -> new Student(1, "siva", 23000);
		Student stu = (Student) supplier.get();
		System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getSalary());

	
		
		
		// predicate--->it gives boolean value
		Predicate<Integer> predicate = number -> {
			if (number % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(predicate.test(10));

		
		
		
		// function ---->it takes argument it return values

		Function<Integer, String> function = s -> {
			if (s % 2 == 0) {
				return "even";
			} else {
				return "odd";
			}
		};
		String s = function.apply(20);
		System.out.println(s);

	}

}
