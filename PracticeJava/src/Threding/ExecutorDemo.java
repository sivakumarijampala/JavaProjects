package Threding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import overriding.mapiteration;

public class ExecutorDemo {
	public static void main(String[] args) {
		ThreadPool[] pool= {
				            new ThreadPool("siva"),
				            new ThreadPool("kumari"),
				            new ThreadPool("malliswari"),
		                    new ThreadPool("ram")
				            
				};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(ThreadPool p:pool) {
		service.submit(p);
		}
		service.shutdown();
	}

}
