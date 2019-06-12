package java8featuresOfStaticAndDefaultMethodInInterface;

public interface InterfaceI {
	public void data();
	static void testing() {
		System.out.println("this is static method");
	}
	default void cheching() {
		System.out.println("this is default method");
	}

}
