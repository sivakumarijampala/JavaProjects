package overriding;

public class javaInterfaces implements A1, B1 {
	public static void main(String[] args) {
		javaInterfaces j = new javaInterfaces();
		j.display();
		A1.show();
		B1.show();
		j.show();
        A1.print();
        j.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		A1.super.display();
		B1.super.display();
	}

	/*
	 * @Override public void show() { // TODO Auto-generated method stub
	 * System.out.println("show method"); }
	 */
	
	static void show() {
		System.out.println("show method");
	}
}

interface A1 {
	// void show();
	default void display() {
		System.out.println("interface A");

	}

	static void show() {
		System.out.println("static show method in A1");
	}
	
	static void print() {
		System.out.println("static print method");
	}
	
}

interface B1 {
	
	static void show() {
		System.out.println("static show method in B1");
	}

	default void display() {
		System.out.println("interface B");
	}
	
	default void print() {
		System.out.println("default static method");
		
	}
}
