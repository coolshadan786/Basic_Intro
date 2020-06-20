import java.util.*;
import java.lang.*;

public class Reversse {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
	            String str=sc.next();
	            int len=str.length();
	            for(int i=len;i>0;i--){
	            	System.out.print(str.charAt(i));
	            }
        }
}

