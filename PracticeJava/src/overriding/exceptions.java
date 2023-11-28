package overriding;

public class exceptions {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			String s = null;
			System.out.println(s.length());

		} catch (NumberFormatException e) {

			// TODO: handle exception
		}
		catch (ArithmeticException e) {
			System.out.println("arithmatic exception");
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception resolved");
		}
		System.out.println("end");
		

		/*
		 * catch (Exception e) { // TODO: handle exception
		 * System.out.println("error occur");
		 * 
		 * System.out.println(e); System.out.println("**********"); e.printStackTrace();
		 * 
		 * }
		 */

	}

}
