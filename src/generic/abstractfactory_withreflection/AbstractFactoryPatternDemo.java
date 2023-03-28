package generic.abstractfactory_withreflection;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// deberia limitar las fabricas para que solo puedan fabricar de su tipo
		// mejorar casteos
		
		ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory(ShapeFactory.class);
		Rectangle rectangle = (Rectangle) shapeFactory.getShape(Rectangle.class);
		rectangle.draw();
		
		RoundedShapeFactory roundedShapeFactory = (RoundedShapeFactory) FactoryProducer.getFactory(RoundedShapeFactory.class);
		RoundedRectangle roundedRectangle = (RoundedRectangle) roundedShapeFactory.getShape(RoundedRectangle.class);
		roundedRectangle.draw();
	}
	
}
