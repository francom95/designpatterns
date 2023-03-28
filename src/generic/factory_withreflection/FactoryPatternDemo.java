package generic.factory_withreflection;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Circle circle = (Circle) ShapeFactory.getShape(Circle.class);
		circle.draw();
		
		Rectangle rectangle = (Rectangle) ShapeFactory.getShape(Rectangle.class);
		rectangle.draw();
		
		Square square = (Square) ShapeFactory.getShape(Square.class);
		square.draw();
	}
	
}
