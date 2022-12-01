/*WAP to find factorial of a number */

import static java.lang.System.out;
import java.math.BigInteger;
import java.util.Scanner;

class Factorial
{
	public static BigInteger factorial(int N)
    {

        BigInteger n = new BigInteger("1"); 
 
        for (int i = 2; i <= N; i++)
            n = n.multiply(BigInteger.valueOf(i));
 
        return n;
    }
		
	public static void main(String[] g)
	{
		out.println("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		out.printf("\nFactorial of %d is ",N);
		out.println(factorial(N));
		
	}
		
}
