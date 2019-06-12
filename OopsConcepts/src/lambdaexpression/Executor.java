package lambdaexpression;

public class Executor {
	public static void main(String arg[]) {
		
		InterfaceI obj = (a,b)->a+b;
		
		int z = obj.sum(5,5);
		System.out.println(z);
		
	}

}
