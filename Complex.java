package complexno;

import java.util.Scanner;
public class Complex {
	 public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in); 
	        System.out.print("Enter the values");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();  
	        System.out.println((a + c) + " + " + (b + d) + "i");  
	        System.out.println((a - c) + " + " + (b - d) + "i");  
	        System.out.println((a * c - b * d) + " + " + (a * c + b * d) + "i");  
	    } 
}

// 3 2 1 4 = 4 + 6i  , 2+ -2i  , -5 + 11i