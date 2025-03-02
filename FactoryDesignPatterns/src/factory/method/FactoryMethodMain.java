package factory.method;

import factory.method.shapefactory.CircleFactory;
import factory.method.shapefactory.ShapeFactory;
import factory.method.shapefactory.SquareFactory;
import factory.method.shapefactory.TriangleFactory;
import factory.method.shapes.Shape;

public class FactoryMethodMain {

	public static void main(String[] args) {
		ShapeFactory factory = new SquareFactory();
		Shape shape1 = factory.createShape();
		shape1.draw();
		System.out.println(shape1);
		
		factory = new CircleFactory();
		Shape shape3 = factory.createShape();
		shape3.draw();
		
		factory = new TriangleFactory();
		Shape shape4 = factory.createShape();
		shape3.draw();

	}

}
