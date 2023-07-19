
public class demo1 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		
		String name = null ;
		try  {
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException ae) {
			System.out.println("Cann't");
		}
		catch(NullPointerException ne) {
			//System.out.println(ne);
			ne.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Ex");
		}
		System.out.println("Thank you");
	}

}
