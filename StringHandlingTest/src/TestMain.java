import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int val = Integer.parseInt(sc.nextLine());
		
		boolean res = false;
		try {
			res=isPrime(val);
		} catch (Exception e) {
			System.out.println("Invalid number");
		}
		
		if(res) {
			System.out.println(val+ " is prime");
		}else {
			System.out.println(val+ " is not a prime");
		}
		
	}
	
	static boolean isPrime(int n) throws Exception { // inform the caller that it is going to throws excepion
		
		if(n<2)
		{
			throw new Exception();	// create exception programatically
		}
		
		boolean result = true;
		// 19 % 2 3 4 5 6 7 8 9 10
		for(int i=2; i<= n/2; i++) {
			if(n%i==0) {
				result = false;
				break;
			}
		}
		
		return result;
	}

}


