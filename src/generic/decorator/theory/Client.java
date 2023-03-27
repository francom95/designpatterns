package generic.decorator.theory;

public class Client {

	public static void main(String[] args) {
		Component a = new ConcreteComponent();
		Component b = new ConcreteDecoratorA(a);
		Component c = new ConcreteDecoratorB(b);
		
		// Decorator -> Decorator -> Component
		c.execute();
	}
	
}
