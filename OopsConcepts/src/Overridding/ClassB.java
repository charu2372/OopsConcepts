package Overridding;

public class ClassB extends ClassA{
	
	@Override
	//overridden method with own logic
	public void sum(int x, int y) {
		System.out.println(x*x + y*y);
	}
	public void mul(int a, int b) {
		System.out.println(a/b);
	}

}
