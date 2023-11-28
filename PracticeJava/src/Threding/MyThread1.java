package Threding;

public class MyThread1 extends Thread {
	
	Display1 d;
	public MyThread1(Display1 d) {
		this.d=d;
	}
	
	public void run() {
		d.show();
	}

}
