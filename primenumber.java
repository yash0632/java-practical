/*WAP to generate prime numbers */

import static java.lang.System.out;
import java.util.*;
class PrimeNumberGen
{
    public static Vector<Integer> sieve(int n)
    {
        Vector<Integer> Primes = new Vector<Integer>(n);
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                Primes.add(i);
        }

        return Primes;
    }
    public static void main(String[] g)
    {
        out.println("Prime Number Generator");
        out.println("Enter N: ");

        Scanner scanner = new Scanner(System.in);
 
        int n = Integer.parseInt(scanner.nextLine());
        out.printf("Primes less than %d\n",n); 
        //using Sieve Erastothense
		Vector<Integer> Primes = sieve(n);
		out.printf("\n");
		for( int a : Primes)
		{
			out.printf(" %d ",a);
		}
		

    }
}

