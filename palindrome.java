//WAP to check if string is palindrome


import static java.lang.System.out;
import java.util.*;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
class Palindrome
{
    public static boolean palindrome(String s)
    {
		CharacterIterator i = new StringCharacterIterator(s);
		CharacterIterator j = new StringCharacterIterator(s);
		char a,b;
		
		for( a = i.first(), b = j.last(); a != CharacterIterator.DONE && b != CharacterIterator.DONE; a = i.next(), b= j.previous())
		{
			if(a != b)
			{
				return false;
			}
		}
		return true;
    }
    public static void main(String[] g)
    {
        out.println("Palindrome");
        out.println("Enter String: ");

        Scanner scanner = new Scanner(System.in);
 
        String s = scanner.nextLine();
		
		if(palindrome(s))
		{
			out.printf("\n%s is a palindrome",s);
		}
		else
		{
			out.printf("\n%s is not a palindrome",s);
		}
	}
		
 }
