package abstraction;

public class B extends A{

	@Override
	public void sub(int a, int b) {
		int sub1=a-b;
		System.out.println(sub1);
	}

	@Override
	public int mul(int a, int b) {
	 return a*b;
		
	}
	
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	
	

}
