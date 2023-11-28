package Threding;

public class MyThread2 extends Thread{

	Display1 d;
	public MyThread2(Display1 d) {
		this.d=d;
	}
	
	public void run() {
		d.show1();
	}
}
