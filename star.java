package sample;
import java.util.Scanner;
public class star {
	public static void main(String[] args){
		int mainArray[] = { 1, 2, 3, 2, 5, 6, 2 }, subArray[] = { 2, 2, 2 };

	
	}
	    void findIfArrayIsASubset(int[] main, int[] sub) {
	    int count = 0;
	    for (int i = 0; i < main.length; i++) {
	        for (int j = 0; j < sub.length; j++) {
	            if (main[i] == sub[j]) {
	                main[i] = -1;
	                count++;
	                break;
	            }
	        }
	    }
	    if (count == sub.length)
	        System.out.println("is a subset");
	    else
	        System.out.println("is not a subset");
	    }}