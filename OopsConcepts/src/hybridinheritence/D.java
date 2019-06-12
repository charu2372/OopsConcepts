package hybridinheritence;

public class D extends B implements C {

	@Override
	public void sum(int a, int b) {
	System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}
	public void div(int a, int b) {
		System.out.println(a/b+" child method");
	}

	@Override
	public void ab() {
		System.out.println("absract menthod from abstract class");
		
	}
	

}
