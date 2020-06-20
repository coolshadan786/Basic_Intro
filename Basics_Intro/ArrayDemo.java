import java.util.Arrays;
public class ArrayDemo {

	public static void main(String[] args) {
		int[] a=  {1,2,3,4,5,6,7,8,9};
		int[] a2= {1,2,3,4,5,6,7,8,9};
		int key=3;
		int b= Arrays.binarySearch(a2, key);
//		for(int i=0;i<b.length;i++) {
			System.out.println(b);
//		}

	}
}