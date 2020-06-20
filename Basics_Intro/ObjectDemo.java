class Calc {
	int m;
	int n;
	int result;

	public void perform() {
		result = m + n;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.m = 10;
		obj.n = 3;
		obj.perform();

		System.out.println(obj.result);

	}

}
