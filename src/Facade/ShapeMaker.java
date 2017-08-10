package Facade;

import Models.Circle;
import Models.Rectangle;
import Models.Shape;
import Models.Square;

public class ShapeMaker
{
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMaker()
  {
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();
  }

  public void drawCircle()
  {
    circle.draw();
  }

  public void drawSquare()
  {
    square.draw();
  }

  public void drawRectangle()
  {
    rectangle.draw();
  }
}
