package overriding;

public class Human extends Animal {
	public Human() {
		System.out.println("parameter less constructor of child class");
		
	}
	public Human(String mes) {
		System.out.println("child class parameterized constructor");
	}
	public void dispaly() {
		System.out.println("child class");
	}

}
