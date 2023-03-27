package generic.decorator.theory;

public class ConcreteDecoratorB extends BaseDecorator{

	public ConcreteDecoratorB(Component wrappee) {
		super(wrappee);
	}

	public void execute() {
		super.execute();
		this.extra();
	}
	
	public void extra() {
		System.out.println("Adding extra ConcreteDecoratorB functionality");
	}
	
}
