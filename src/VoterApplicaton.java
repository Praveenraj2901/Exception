import java.util.Scanner;
public class VoterApplicaton {
	public static void main(String[] args)throws AgeException {
		Scanner s = new Scanner(System.in);
		System.out.println("name:");
		String name = s.next();
		System.out.println("age:");
		int age = s.nextInt();
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeException("Not Eligible");
			
		}
		System.out.println("gender:");
		String gender = s.next();
		System.out.println(gender);
	}
	

}
