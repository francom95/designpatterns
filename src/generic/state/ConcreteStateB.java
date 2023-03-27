package generic.state;

public class ConcreteStateB extends State {

	@Override
	public void doThis() {
		System.out.println("Execution of doThis() on State B.");
	}

	@Override
	public void doThat() {
		System.out.println("Execution of doThat() on State B.");
	}

}
