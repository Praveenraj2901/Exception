import java.util.Scanner;

public class FacebookLogin {
	public static void main(String[] args)throws LoginException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UserName");
		
		String user = s.next();
		if(user.length()>3) {
			System.out.println("Enter Password");
		}
		else {
			throw new LoginException("Invalid User");
		}
		
		String password = s.next();
		if(password.contains(user)) {
			System.out.println("Login");
		}
		else {
			throw new LoginException("Invalid User");
		}
		System.out.println("Welcome Back");
	}

}
