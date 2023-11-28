package practice;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		//t1.start();
		
		t1.run();

		MyThread1 t2 = new MyThread1();
		//t2.start();
		t2.run();
	}

}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" " + Thread.currentThread().getName());
		}
		System.out.println("end");
	}

	public void start() {
		System.out.println("started");
	}

}
