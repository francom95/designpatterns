package generic.decorator.theory;

public class ConcreteDecoratorA extends BaseDecorator{

	public ConcreteDecoratorA(Component wrappee) {
		super(wrappee);
	}

	public void execute() {
		super.execute();
		this.extra();
	}
	
	public void extra() {
		System.out.println("Adding extra ConcreteDecoratorA functionality");
	}
	
}
