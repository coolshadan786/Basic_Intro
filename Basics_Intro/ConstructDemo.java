class Calc1{
	int num1;
	int num2;
	int result;
	public Calc1() {
		int num1=5;
		int num2=10;
		System.out.println("Shadan");
	}
	public Calc1(int n){
		 num1= n;
		System.out.println("Umair Abdullah");
	}
	public Calc1(float m) {
		num1= (int)m;
	}
}
public class ConstructDemo {

	public static void main(String[] args) {
		Calc1 obj= new Calc1(2);
		
		System.out.println(obj.num1);

	}

}
