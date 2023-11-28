package Threding;

import java.util.concurrent.Callable;

public class CallableExample {
	public static void main(String[] args) {

		Callable<Integer> call = () -> {

			int a = 10;
			int b = 20;
			return a + b;
		};

		Callable<Integer> call1 = () -> {

			int a = 40;
			int b = 20;
			return a *b;
		};

		Thread t = new Thread(() -> {

			try {
				int r = call.call();
				System.out.println(r);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		t.start();

		Thread t1 = new Thread(() -> {

			try {
				int r1 = call1.call();
				System.out.println(r1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		
		t1.start();

	}
}
