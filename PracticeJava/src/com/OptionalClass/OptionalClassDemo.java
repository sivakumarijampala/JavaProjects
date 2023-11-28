package com.OptionalClass;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {

		// it gives optional class empty object
		Optional empty = Optional.empty();
		System.out.println(empty);

		String email = "siva123@gmail.com";
		String e = null;

		// if email is null it will give null pointer exception
		// or else it will give optional class object that contains value
		Optional optional = Optional.of(email);
		System.out.println(optional);

		// if email is null it will give optional class empty object
		// or else it will give optional class object that contains value
		Optional op = optional.ofNullable(email);

		// if the optional class object is null it will give null pointer exception
		// or else it will give value of optional object
		System.out.println(op.get());

		if (op.isPresent()) {
			System.out.println(op.get());
		} else {
			System.out.println("no element");
		}

		// it will give optional class value if it present or else it will give default
		// value
		Optional<String> op1 = optional.ofNullable(e);
		String defaultvalue = op1.orElse("siva456");
		System.out.println(defaultvalue);
		
		
		String value=op1.orElseGet(()->"siva34567");
		System.out.println(value);
		
		
		//if eamil idf found it will give optional class value or else it will throw exception
		//String option=op1.orElseThrow(()->new IllegalArgumentException("email not found"));
		//System.out.println(option);
		
		
		String res="abc";
		Optional<String> o=Optional.of(res);
		o.filter(r->r.contains("ab")).ifPresent(r->System.out.println(r));
		
		
		
	}

}
