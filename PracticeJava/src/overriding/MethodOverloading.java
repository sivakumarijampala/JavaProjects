package overriding;

import java.io.IOException;

public class MethodOverloading {

	public void add() throws ArithmeticException {
		System.out.println("hello");
	}

	public void add(int a) throws IOException {
		System.out.println("hi");
	}

	public void add(String s) throws Exception {
     System.out.println("hey");
	}

	public static void main(String[] args) {
    System.out.println("mom");
	}

}
