package Threding;

public class yeildThreadDemo {
	public static void main(String[] args) {
		YeildThread y=new YeildThread();
		y.start();
		for(int i=0;i<10;i++) {
			System.out.println("welocme");
		}
	}

}
