
public class demo {
	public static void main(String[] args) {
		System.out.println("welcome");
		int a = 10;
		int b = 5;
		int c = 0;
		
		System.out.println(a+b+c);
		
		try {
			System.out.println(a/c);
			
		}
		catch(Exception e) {
			System.out.println("Can't divide by 0");
		}
		
		
		
		System.out.println(a*b);
		
		System.out.println("bye bye");
		
	}

}
