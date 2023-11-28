package overriding;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=new Human();
		
		System.out.println("*********");
		Animal animal=new Animal();
		
		System.out.println("********");
		Animal a=new  Human();
		
		System.out.println("*********");
		Human hu=new Human("sivakumari");
		
		System.out.println("********");
		Animal ani=new Animal("dog");
		
		System.out.println("************");
		Human hum=new Human();
		hum.dispaly();
		/*
		 * Animal animal1=new Human(); animal1.display();
		 */

	}

}
