class Con{
	public int add(int ... n) {
		int sum=0;
		for(int i: n) {
			sum=sum+i;
		}
		return sum;
	}
}
public class VarLenArguDemo {

	public static void main(String[] args) {
		Con obj = new Con();
		System.out.println(obj.add(4,2,5,8,96,3,1,25,7));

	}

}
 