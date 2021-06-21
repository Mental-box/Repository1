
public class A {
	public static void main(String args[]) {
		System.out.println("this line printed from A");
		B classB = new B();
		classB.printB();
		C classC = new C();
		classC.printC();
	}
}
