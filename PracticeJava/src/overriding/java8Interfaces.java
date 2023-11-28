package overriding;

public class java8Interfaces implements sample1,sample2 {
public static void main(String[] args) {
	java8Interfaces j=new java8Interfaces();
	j.display();
}

@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("override display method");
	sample2.super.display();
}

/*
 * @Override public void display() { // TODO Auto-generated method stub
 * sample2.super.display(); }
 */
}
interface sample1{
	 void display() ;
	default void show1() {
		
	}
	
	
}
interface sample2{
	default void display() {
		System.out.println("sample 2 method ");
	}
	 
  static void show1() {
		
	}
	
}