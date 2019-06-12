package multilevelInheritence;

public class ExeCutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child= new Child();
		child.studentId(003);
		child.studentName("Niru");
		child.studentPhone(123456);
		child.setAddress("streamwood");
	System.out.println(child.getAddress());
		System.out.println("************************************");
		
		
		ParentOne po= new ParentOne();
		po.studentId(001);
		po.studentName("Reena");
		System.out.println("*************************************************");
		
		ParentTwo pt = new ParentTwo();
		pt.studentId(002);
		pt.studentName("veena");
		pt.studentPhone(22233344);
		
	}

}
