import Decorator.RedShapeDecorator;
import Facade.ShapeMaker;
import FacadeKt.ShapeMakerKt;
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


    /* Here even after manipulate some Java classes, we can manipulate Kotlin classes too, what is amazing! */

    FactoryKt.ShapeFactory shapeFactoryKt = new FactoryKt.ShapeFactory();

    KotlinModels.Shape shapeCircleKt = shapeFactoryKt.getShape("Circle");
    KotlinModels.Shape shapeSquareKt = shapeFactoryKt.getShape("Square");
    KotlinModels.Shape shapeRectangleKt = shapeFactoryKt.getShape("Rectangle");

    DecoratorKt.RedShapeDecorator decoratorKt = new DecoratorKt.RedShapeDecorator(shapeCircleKt);

    decoratorKt.draw();

    // Again my favorite one! I love this pattern! Really helps a lot on doc and modularization of any aplication, but for me
    //especially in Android apps! :D
    ShapeMakerKt shapeMakerKt = new ShapeMakerKt();

    shapeMakerKt.drawCircle();//Same result as shapeCircle::draw() method in Java -> Inside Circle::draw() method.

    shapeMakerKt.drawRectangle();//Same result as shapeRectangle::draw() method in Java -> Inside Rectangle::draw() method.

    shapeMakerKt.drawSquare();//Same result as shapeSquare::draw() method in Java -> Inside Square::draw() method.
  }
}
