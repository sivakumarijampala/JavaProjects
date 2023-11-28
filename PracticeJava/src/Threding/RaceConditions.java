package Threding;

class C {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class RaceConditions {

	public static void main(String[] args) throws InterruptedException {
		C c = new C();
		
		System.out.println(Thread.currentThread().getName());

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					// System.out.println("start");
					c.increment();
				}

			}
		};

		Runnable r1 = () -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();

			}
		};

		Thread t1 = new Thread(r);
		t1.start();

		Thread t2 = new Thread(r1);
		t2.start();

		t1.join();
		t2.join();
		System.out.println("count is:" + c.count);

	}

}
