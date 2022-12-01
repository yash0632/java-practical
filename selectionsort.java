/* WAP for Selection Sort*/

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Enter length of array");
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i =0; i<n;i++)
	    {
		arr[i] = sc.nextInt();
	    }		
	    selection_sort(arr);
}


public static void selection_sort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        int min_index=i;
        for(int j=i;j<n;j++){
            if(arr[j]<arr[min_index]){
                min_index=j;
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
    }
     System.out.print("Sorted array=");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
 
}
