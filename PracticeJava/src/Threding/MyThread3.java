package Threding;

public class MyThread3 extends Thread{
	Display2 d;
	String name;
	public MyThread3(Display2 d,String name) {
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		try {
			d.show(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

}
