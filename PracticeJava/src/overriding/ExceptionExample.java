package overriding;

public class ExceptionExample {
	public static void main(String[] args) {
		
		try {
			int a=10/0;
		}
		System.out.println("dfgh");
		catch(Exception e){
			System.out.println("exception "+e");
		}

		/*
		 * try { int a = 10 / 0; }
		 * 
		 * catch (ArithmeticException e) { System.out.println(e); }
		 * 
		 * catch (ArrayIndexOutOfBoundsException e1) { System.out.println(e1); }
		 * System.out.println("try"); try { } finally {
		 * 
		 * }
		 */

	}

}
