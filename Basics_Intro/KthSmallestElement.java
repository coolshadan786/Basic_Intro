import java.util.*;
import java.lang.*;
import java.io.*;

public class KthSmallestElement {
		public static void main (String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Test case");
		    int t=sc.nextInt();
		    for(int i=0;i<t;i++){
		    	System.out.println("Enter Size n");
		        	int n=sc.nextInt();
		        Integer a[]=new Integer[n];
		        for(int j=0;j<n;j++){
		        System.out.println("Enter the data of array");
		            a[j]=sc.nextInt();
		        }
		        System.out.println("Kth place");
		        int k=sc.nextInt();
		        Xyz x=new Xyz();
		        System.out.print("The Kth element data :");
		        System.out.println(x.kthSmallest(a,k));
		    }
		}
	}
class Xyz{
	     public static int kthSmallest(Integer[] a,int k){ 
	         Arrays.sort(a);
	         return a[k-1]; 
	     }  
}    
//um@ir
