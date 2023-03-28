package generic.abstractfactory_withreflection;

public abstract class AbstractFactory {

	abstract Shape getShape(Class<? extends Shape> clase);
	
}
