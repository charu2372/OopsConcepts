package multipleInheritence;

public class C extends A implements B{

	@Override
	public void sub(int a, int b) {
		int x = a - b;
		System.out.println("the subsraction " +x);
	}	
		public void mul(int a, int b) {
			int y =a*b;
			System.out.println("the child method : "+y);
		}
		
	}


