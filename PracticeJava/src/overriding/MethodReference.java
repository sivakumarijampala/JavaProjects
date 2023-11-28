package overriding;

interface Sample{
	//void show();
	void show1();
}

public class MethodReference {
  public static void display() {
	  for(int i=0;i<5;i++) {
		  System.out.println(i);
	  }
  }
  
  public void display1() {
	  for(int i=0;i<5;i++) {
		  System.out.println(i);
	  }
  }
	
	public static void main(String[] args) {
		MethodReference m=new MethodReference();
		Sample s=m::display1;
          s.show1();
		
	}
}
