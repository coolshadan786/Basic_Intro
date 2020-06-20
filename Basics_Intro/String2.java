import java.io.*;
import java.util.*;

public class String2 {

	public static void main(String[] args) {
		String str=" Umair Abdullah ";
		String str2=new String("Shadan");
		
		System.out.print(str + " " + str2);
		System.out.println();
		
		System.out.println(str + " ghar ka naam " + str2);

		int len=str.length();
		System.out.println(len);
		
		String s=str.concat(str2);
		System.out.println(s);
		
		for(int i=0;i<len;i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		
		int in=str.indexOf('d');
		System.out.println(in);
		
		int inn=str.lastIndexOf('i');
		System.out.println(inn);
		
		String sd=str.toLowerCase();
		System.out.println(sd);
		
		String sa=str.toUpperCase();
		System.out.println(sa);
		
		String sx=str.trim();
		System.out.println(sx);
		
		String sw=str.substring(5);
		System.out.println(sw);
		
		String sq=str.substring(2,9);
		System.out.println(sq);
		
		String[] fv=str.split(" ");
		for(int i=0;i<fv.length;i++) {
			System.out.println(fv[i]);
		}
		
		char[] fg=str.toCharArray();
		int len2=fg.length;
		for(int j=0;j<len2;j++){
			System.out.print(fg[j] + " ");
		}
		
		// TODO Auto-generated method stub

	}

}
