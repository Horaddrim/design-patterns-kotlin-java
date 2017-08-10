package Factory;

import Models.Circle;
import Models.Rectangle;
import Models.Shape;
import Models.Square;

public class ShapeFactory
{
  public Shape getShape(String shapeType)
  {
    if(shapeType.trim().length() != 0 && !shapeType.isEmpty())
    {
      if(shapeType.equalsIgnoreCase("Circle"))
      {
        return new Circle();
      }
      else if(shapeType.equalsIgnoreCase("Square"))
      {
        return new Square();
      }
      else if(shapeType.equalsIgnoreCase("Rectangle"))
      {
        return new Rectangle();
      }
    }
    else
    {
      return null;
    }
    return null;
  }
}
