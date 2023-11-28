package Threding;

public class ThreadDemo extends Thread {
	int total = 0;

	public void run() {

		synchronized (this) {

			System.out.println("child thread starts");
			for (int i = 0; i < 10; i++) {
				// System.out.println("hello");
				total = total + i;
			}
			this.notify();
			System.out.println("child thread give notification");
		}

	}
}
