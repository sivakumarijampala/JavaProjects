package Threding;

public class LambdaAndAnnonomus {
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Hello");
				}

			}
		};

		Runnable r1 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("hey");

			}
		};

		Thread t1 = new Thread(r);
		System.out.println("priority:" + t1.getPriority());
		System.out.println("name:" + t1.getName());
		t1.start();
		Thread t2 = new Thread(r1);
		t2.start();
	}
}
