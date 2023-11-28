package overriding;

class Sample1 {
	public Sample1() {
		System.out.println("constructor referance");
	}
}

interface Sam {
	public Sample1 dis();
}

public class ConstructorReferance {

	public static void main(String[] args) {
          Sam s=Sample1::new;
          s.dis();
	}

}
