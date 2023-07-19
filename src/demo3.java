
public class demo3 {
	public static void main(String[] args) {
		System.out.println("hi");
		String name = "Praveen";
		
		try {
			System.out.println(name.charAt(name.length()+1));
		}
		catch(StringIndexOutOfBoundsException ie) {
			System.out.println("out");
		}
		System.out.println("Bye");
	}

}
