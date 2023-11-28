package overriding;

public class throwkeyword {
	public static void main(String args[]) {

		ex.validate(13);
		System.out.println("rest of the code...");

	}

	class ex {
		public static void validate(int age) {
			if (age < 18) {
				throw new ArrayIndexOutOfBoundsException("Person is not eligible to vote");
			} else {
				System.out.println("Person is eligible to vote!!");
			}
		}
	}
}
