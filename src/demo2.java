
public class demo2 {
	public static void main(String[] args) {
		System.out.println("Hi");
		
		String num = "TN61M2989";
		
		try {
			int nums = Integer.parseInt(num);
			System.out.println(nums);
		}
		catch(NumberFormatException nme) {
			System.out.println(nme);
		}
		System.out.println("tq");
	}

}
