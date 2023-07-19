
public class demo4 {
	public static void main(String[] args) {
		System.out.println("Hi");
		
		String[] word = {"Raj","Ram","Sam"};
		try {
			System.out.println(word[0]+word[4]);
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("out");
		}
		finally {
			System.out.println(word[0]+word[2]);
		}
		System.out.println("Bye");
	}

}
