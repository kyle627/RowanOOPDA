
public class B extends A{
	private int var2;
	
	public int getVar2() {
		return var2;
	}
	
	public int f1(int n1) {
		System.out.println("f1 B with param");
		return n1;
	}
	public int f3() {
		System.out.println("f3 B");
		return 0;
	}
}
