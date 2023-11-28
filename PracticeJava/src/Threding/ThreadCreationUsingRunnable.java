package Threding;

abstract class Z1 {
	public abstract void show();
}

class A1 extends Z1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
		}
	}

	@Override
	public void show() {

		System.out.println("this is show method");
	}

}

class B1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class ThreadCreationUsingRunnable {
	public static void main(String[] args) throws InterruptedException {

		Runnable obj1 = new A1();
		Runnable obj2 = new B1();

		Thread t = new Thread(obj1);
		t.start();
		t.join();
		Thread t1 = new Thread(obj2);
		t1.start();

	}

}
