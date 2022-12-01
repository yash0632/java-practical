/* WAP to display terms of Fibonacci Series */
/*Solve recurrence relation  a_n = a_n-1 + a_n-2 , we get a_n = [{(1+sqrt(5))/2}^n - {1 - (1+sqrt(5))/2}^n]/sqrt(5)  */

import static java.lang.System.out;
import java.util.Scanner;
class Fibonacci_Series
{
	public static void main(String[] g)
	{
		out.println("Fibonacci Series");
		out.println("Enter number of terms to display:");
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		double sqrt_5 = Math.sqrt(5);
	    double phi = (1+sqrt_5)/2;
		double L = 1 - phi;
		
		double a_i = 0; //First fibonacci number
		
		out.printf("\nFirst %d terms of Fibonacci Series: 0 ",n);
		for(int i = 1; i < n; i++)
	    {   
			a_i =  (Math.pow(phi,i) - Math.pow(L,i))/sqrt_5;
			out.printf(" %d ",(int)a_i);
		}			
		
	}
}
