package generic.abstractfactory_withreflection;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(Class<? extends Shape> clase)  {
		try {
			Shape shape = clase.getDeclaredConstructor(null).newInstance();
			return shape;
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
