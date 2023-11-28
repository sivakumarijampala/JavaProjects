package Threding;

import java.util.concurrent.Callable;

public class UsingCallable implements Callable {
	int num = 0;

	public UsingCallable(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
