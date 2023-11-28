package Threding;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFeatureDemo {
	public static void main(String[] args) {
		UsingCallable[] call = { new UsingCallable(10), new UsingCallable(20), new UsingCallable(30),
				new UsingCallable(40)

		};

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (UsingCallable u : call) {
			Future f = service.submit(u);
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
