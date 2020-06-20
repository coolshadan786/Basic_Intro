

	/*package whatever //do not write package name here */

	import java.util.*;
	import java.lang.*;
	import java.io.*;
	import java.math.*; 

public class SumOfDistinctElement {	
		    static int sumOfDistinct(int a[], int n){ 
	        int sum = 0; 
	        for (int i = 0; i < n; i++) { 
	            if (a[Math.abs(a[i]) - 1] >= 0) { 
	                sum += Math.abs(a[i]); 
	                a[Math.abs(a[i]) - 1] *= -1; 
	            } 
	        } 
	        return sum; 
	    } 	    
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i++){
		        int n=sc.nextInt();
		        int[] a=new int[n];
		        for(int j=0;j<n;j++){
		            a[i]=sc.nextInt();
		        }
		        System.out.println(sumOfDistinct(a,n)); 
		    } 
	    } 
}
