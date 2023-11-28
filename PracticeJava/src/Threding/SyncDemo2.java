package Threding;

import overriding.mapiteration;

public class SyncDemo2 {
	public static void main(String[] args) {
		
		Display1 d = new Display1();

		MyThread1 t1 = new MyThread1(d);
		t1.start();
		
		MyThread2 t2=new MyThread2(d);
		t2.start();

	}

}
