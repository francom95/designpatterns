package generic.strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public void doSomething() {
		System.out.println("Execution of doSomething() on Stategy B");
	}

}
