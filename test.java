package sample;    
import java.util.Scanner;
import java.util.HashSet;
public class test

{
	 String longestPrefix = null;
	  if(strs.length>0){
	    	String[] strs;
	        longestPrefix = strs[0];
	    }
	    for(int i=1; i<strs.length; i++){
	    	String[] strs;
	        String analyzing = strs[i];
	        int j=0;
	        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
	            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
	                break;
	            }
	        }
	        longestPrefix = strs[i].substring(0, j);
	    }
	    return longestPrefix;
	}}