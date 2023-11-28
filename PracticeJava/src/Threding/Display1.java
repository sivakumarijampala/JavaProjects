package Threding;

public class Display1 {

	public synchronized void show() {

		for (int i = 0; i < 10; i++) {
			System.out.println("welcome :");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public synchronized void show1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hi :");
		}
		
	}
	
	

}
