package sample;
import java.util.Scanner;
public class test {
public static void main(String[] args){

	   Scanner s = new Scanner(System.in);
 int n, max;

	    System.out.print("Enter number of elements in the array:");

	        n = s.nextInt();

	        int a[] = new int[n];

	        System.out.println("Enter elements of array:");

	        for(int i = 0; i < n; i++)

	        {

	            a[i] = s.nextInt();

	        }

	        max = a[0];

	        for(int i = 0; i < n; i++)

	        {

	            if(max < a[i])

	            {

	                max = a[i];

	            }

	        }

	        System.out.println("Maximum value:"+max);

	    }

	
}
