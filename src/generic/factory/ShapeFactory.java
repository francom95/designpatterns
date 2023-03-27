package generic.factory;

public class ShapeFactory {

	public static Circle createCircle() {
		return new Circle();
	}
	
	public static Square createSquare() {
		return new Square();
	}
	
	public static Rectangle createRectangle() {
		return new Rectangle();
	}
	
}
