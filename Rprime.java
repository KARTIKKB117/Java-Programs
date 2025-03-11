package prime;
import java.util.Scanner;

public class Rprime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //sc
		Boolean isprime = true;
		System.out.println("Enter a number:");
		int n = scanner.nextInt();                  // sc.nextInt();
		
		for(int i=2;i<=n/2;i++) {
			if (n%i==0)
				isprime = false;
		}
		
		if(isprime)
			System.out.println(n+" is  prime ");
		else
			System.out.println(n+" is not prime");
	}

}
