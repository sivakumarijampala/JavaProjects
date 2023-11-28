package Threding;

public class interThreadCommunication {
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
		synchronized (t) {
			System.out.println("main thread calls wait method");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.total);
		}

	}

}
