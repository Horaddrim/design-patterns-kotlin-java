package FactoryKt

import KotlinModels.Circle
import KotlinModels.Rectangle
import KotlinModels.Shape
import KotlinModels.Square

class ShapeFactory
{
  fun getShape(shapeType: String): Shape?
  {
    if(!shapeType.trim().isEmpty() && shapeType != null)
    {
      if(shapeType.equals("Circle",true))
      {
        return Circle()
      }
      else if(shapeType.equals("Square",true))
      {
        return Square()
      }
      else if(shapeType.equals("Rectangle",true))
      {
        return Rectangle()
      }
    }
    else
    {
      return null
    }
    return null
  }

}
