package FacadeKt

import KotlinModels.Circle
import KotlinModels.Rectangle
import KotlinModels.Square

class ShapeMakerKt
{
  val circle: Circle = Circle()
  val square: Square = Square()
  val rectangle: Rectangle = Rectangle()

  fun drawCircle()
  {
    circle.draw()
  }

  fun drawSquare()
  {
    square.draw()
  }

  fun drawRectangle()
  {
    rectangle.draw()
  }
}
