package overriding;

public class Person1 {
	public static void main(String[] args) {
		Human1 h=new Siva("siva");
	}

}

class Human1{
	public Human1() {
		
	}
	public Human1(int a) {
		
	}
	
}
class Siva extends Human1{
	public Siva() {
		
	}
	public Siva(String a) {
		
	}
}
