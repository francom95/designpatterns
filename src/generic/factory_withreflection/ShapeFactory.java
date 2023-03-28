package generic.factory_withreflection;

public class ShapeFactory {

	public static Shape getShape(Class clase) {
		try {
			Shape shape = (Shape) clase.newInstance();
			return shape;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
