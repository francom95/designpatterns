package generic.factory;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(ShapeFactory.createCircle());
		shapes.add(ShapeFactory.createSquare());
		shapes.add(ShapeFactory.createRectangle());
		for(Shape shape: shapes) {
			shape.draw();
		}
	}
	
}
