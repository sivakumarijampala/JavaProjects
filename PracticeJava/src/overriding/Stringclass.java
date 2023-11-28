package overriding;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String s1=new String("abc");

		if(s==s1) {
			System.out.println(1);
		}
		else if(s.equals(s1)){
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}

}
