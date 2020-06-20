import java.io.*;
import java.util.*;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Shadan salim");
		StringBuilder sx=new StringBuilder();
		StringBuilder sz=new StringBuilder(20);
		
		System.out.println(sb.length() + " " + sb.capacity());
		System.out.println(sx.length() + " " + sx.capacity());
		System.out.println(sz.length() + " " + sz.capacity());
		
		StringBuilder fv=new StringBuilder("Lucknow");
		fv=fv.append(" Junction");
		System.out.println(fv);
		System.out.println(fv.length() + " " + fv.capacity());
		
		fv=fv.append(" East");
		System.out.println(fv);
		System.out.println(fv.length() + " " + fv.capacity());
		
		fv.reverse();
		System.out.println(fv);
		
		fv.delete(2,5);
		System.out.println(fv);
		
		fv.insert(5, "UUUU");
		System.out.println(fv);
		
		String de=fv.substring(2);
		System.out.println(de);
		
		String nb=fv.substring(5, 9);
		System.out.println(nb);
		
		StringBuilder cv=new StringBuilder("Kanpur Junction");
		StringBuilder mn=cv;
		cv=cv.append(" Located in Uttar Pradesh of India");
		System.out.println(mn);
		// TODO Auto-generated method stub

	}

}
