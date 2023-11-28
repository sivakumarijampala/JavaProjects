
package Threding;

public class SyncDemo1 {
	public static void main(String[] args) {

		Display d = new Display();

		Display d1 = new Display();

		MyThread t1 = new MyThread(d, "shiv");
		t1.start();

		MyThread t2 = new MyThread(d, "shivkumari");
		t2.start();

		MyThread t3 = new MyThread(d1, "pavan");
		t3.start();

		MyThread t4 = new MyThread(d1, "pavankalyan");
		t4.start();

	}

}
