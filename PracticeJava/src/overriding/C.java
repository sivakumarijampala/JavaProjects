package overriding;

public class C {
	public static void main(String[] args) {
		A a = new B();
		a.display();
	}

}

class A {
	public static void display() {
		System.out.println("parent");
	}
}

class B extends A {
	@Override
	public static void display() {
		System.out.println("child");
	}

}
