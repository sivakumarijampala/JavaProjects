package Threding;

public class Display2 {

	public void show(String name) throws InterruptedException {

		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.print("good:");
				Thread.sleep(3000);
				System.out.println(name);
			}
		}
	}

}
