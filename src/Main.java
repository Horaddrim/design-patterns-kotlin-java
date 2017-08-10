import Decorator.RedShapeDecorator;
import Facade.ShapeMaker;
import Models.Shape;
import Factory.ShapeFactory;

public class Main
{
  public static void main(String[] args)
  {
    /* Using the factory pattern, we can create some classes! */
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shapeCircle = shapeFactory.getShape("Circle");
    shapeCircle.draw(); //Inside Circle::draw() method.

    /*Using the decorator pattern, we can personalize them! */
    RedShapeDecorator decorator = new RedShapeDecorator(shapeCircle);
    decorator.draw(); // Border Color: Red && Inside Circle::draw() method.

    Shape shapeRectangle = shapeFactory.getShape("Rectangle");
    shapeRectangle.draw(); //Inside Rectangle::draw() method.

    Shape shapeSquare = shapeFactory.getShape("Square");
    shapeSquare.draw(); // Inside Square::draw() method.

    /* And my personal favorite is the facade, that allows us to use the classes, without really instanciate them! */
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle(); //Same result as shapeCircle::draw() method -> Inside Circle::draw() method.

    shapeMaker.drawRectangle();// Same result as shapeRectangle::draw() method -> Inside Rectangle::draw() method.

    shapeMaker.drawSquare();// Same result as shapeSquare::draw() method -> Inside Square::draw() method.
  }
}
