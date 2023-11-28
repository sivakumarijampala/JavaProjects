package overriding;

public class Animal {
	public Animal() {
		System.out.println("parameter less constructor in parent class");
	}
   public Animal(String message) {
	   System.out.println("parameterized cobstructor");
   }
   
   private void dispaly() {
	   System.out.println("parent class");
   }
}
