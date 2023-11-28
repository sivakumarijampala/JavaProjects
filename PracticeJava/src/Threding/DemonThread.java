package Threding;

public class DemonThread {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setDaemon(true);
		ThreadDemo demo=new ThreadDemo();
		
		demo.setDaemon(true);
		demo.start();
		System.out.println(demo.isDaemon());
	}

}
