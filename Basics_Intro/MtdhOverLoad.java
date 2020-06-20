class Casio{
	public void add(int i,int j){
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
}
public class MtdhOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj= new Casio();
		obj.add(4, 9);
		obj.add(2,4,9);
	}

}
