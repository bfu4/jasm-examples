public class Main {

	static {
		NativeLoader.load("libAllowedClass.so");
	}


	public static void main(String[] args) {
		AllowedClass clazz = new AllowedClass();
		System.out.println(clazz.asSealedInst());

	}

}
