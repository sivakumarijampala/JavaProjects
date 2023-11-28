package Threding;

public class SyncDemo3 {
	public static void main(String[] args) {

		Display2 d = new Display2();
		Display2 d1 = new Display2();
		
		MyThread3 t1 = new MyThread3(d, "malliswari");
		t1.start();
		
		MyThread3 t2 = new MyThread3(d, "ram");
		t2.start();

	}

}
