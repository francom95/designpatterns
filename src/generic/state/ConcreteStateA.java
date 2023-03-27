package generic.state;

public class ConcreteStateA extends State {

	@Override
	public void doThis() {
		System.out.println("Execution of doThis() on State A.");
	}

	@Override
	public void doThat() {
		System.out.println("Execution of doThat() on State A.");
	}

}
