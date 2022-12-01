/*WAP to check if two strings are anagrams */

import java.util.Arrays;  
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String one= sc.nextLine();
	String two= sc.nextLine();
	anagram(one,two);
	
	}
	public static void anagram(String first,String second){
	     boolean status=false;
	    if(first.length()!=second.length()){
	        System.out.println("Strings are not anagram");
	    }else{
	       
	        char[] Arrayfirst = first.toCharArray(); 
	        char[] Arraysecond = second.toCharArray(); 
	        Arrays.sort(Arrayfirst); 
	         Arrays.sort(Arraysecond); 
	         status = Arrays.equals(Arrayfirst, Arraysecond);
	        
	    }
	    if(status){
	        System.out.println("both strings are anagram of each other");
	    }else{
	        System.out.println("not anagaram");
	    }
	}
}
