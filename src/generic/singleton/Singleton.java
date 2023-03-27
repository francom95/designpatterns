package generic.singleton;

public class Singleton {

	public static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {}
	
	public void doSomething() {
		System.out.println("Example of instance method on Singleton.");
	}
	
}
