package Threding;

class z{
	
}

class A extends Z,Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hi");
		}
	}

}

class B  extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
	}
}

public class ThreadsCreation {
	public static void main(String[] args) {

		A a =new A();
		a.start();
		B b=new B();
		b.start();
		
	}

}
