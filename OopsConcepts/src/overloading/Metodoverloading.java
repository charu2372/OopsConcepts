package overloading;

public class Metodoverloading {
	
	public static void sum(int a , int b) {
		System.out.println(a+b);
	}
	
	public static void sum(double  a, int b) {
		System.out.println(a+b);
	}
	public static float sum(int a, double b , int c) {
		return  (float) (a+b+c);
	}
	public static void main(String[] args) {
		
		sum(2,4);
		sum(3.5,4);
	System.out.println(sum(6,2.5,7));
		}

	}

