
public class Tester {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		int num1 = b.f1();
		int num2 = b.f2(22);
		int num3 = b.getVar2();
		
		a = new B();
		
		System.out.println(num2);

	}

}
