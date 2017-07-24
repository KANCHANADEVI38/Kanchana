package sample;
import java.util.Scanner;
public class devi9 {
	
	    public static void main(String[] args) {
	        int n,digit;
	        int count=0,a,i,z,sum=0;
	        Scanner s=new Scanner(System.in);
	        n=s.nextInt();
	        int length=(int)(Math.log10(n)+1);
	         System.out.println(""+length);
	        for(i=0;n<length;i++){
	        while(n>0)
	                 {
	            digit=n%10;
	            a=length;
	            z=digit^a;
	            sum=sum+z;
	            System.out.println(""+sum);
	            count++;
	        
	        }
	    }
	      
	 }
	}

