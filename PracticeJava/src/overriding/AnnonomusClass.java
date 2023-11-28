package overriding;

interface Simple{
	void show();
	void show1();
}

public class AnnonomusClass {
   public static void main(String[] args) {
	   
	   
	   
	   
	Simple s=new Simple() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("simple interface show method");
			
		}

		@Override
		public void show1() {
			// TODO Auto-generated method stub
			System.out.println("show1 method");
			
		}
	};
	s.show();
	s.show1();
	
	
}
}
