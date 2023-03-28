package generic.abstractfactory_withreflection;

import java.lang.reflect.InvocationTargetException;

public class FactoryProducer {

	private AbstractFactory factory;
	
	public static AbstractFactory getFactory(Class<? extends AbstractFactory> clase) {
		try {
			return clase.getDeclaredConstructor(null).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
