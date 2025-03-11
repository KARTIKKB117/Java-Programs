package shape;

import java.util.Scanner;
public class Shape {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the shape:");
        String shape = sc.next();  
        if (shape.equals("circle")) { 
        	System.out.print("radius:");
            double r = sc.nextDouble();  
            System.out.println(2 * Math.PI * r + " " + Math.PI * r * r);  
        } else if (shape.equals("rectangle")) { 
        	System.out.print("length and width:");
            double l = sc.nextDouble(), w = sc.nextDouble();  
            System.out.println(2 * (l + w) + " " + (l * w));  
        } else {  
        	System.out.print("side:  ");
            double s = sc.nextDouble();  
            System.out.println(4 * s + " " + (s * s));  
        }  
    }

}

/* Enter the shape: circle
   radius: 7  = 43.982297150257104 153.93804002589985
   
   Enter the shape: rectangle
   length and width: 5 3  = 16.0 15.0

*/
