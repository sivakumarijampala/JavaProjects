package Threding;

public class Display {
	public static synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("hello:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
