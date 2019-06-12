package inheritence;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			 Child obj= new Child();
			 obj.sum(2, 3);
			 obj.sub(5,1);
			 obj.mul(5,4);
			System.out.println(obj.i);
			// System.out.println(j);
			System.out.println("********************");
			Parent op = new Parent();
			op.sum(4,9);
			op.sub(7, 4);
		System.out.println(	op.i);
				}
	}


