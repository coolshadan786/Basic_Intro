import java.io.*;
import java.util.*;

public class Length1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++) {
			String ar=sc.next();
			int len=ar.length();
			int i;
			int flag=0;
			for(i=0;i<len;i++) {
				if(ar.charAt(i)==1) {
					flag=1;
					break;
				}
			}
			if(flag==1){
				System.out.println(i);
			}else {
				System.out.println("-1");
			}
		}
		
	}

}
