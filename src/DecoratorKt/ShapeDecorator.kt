package DecoratorKt

import KotlinModels.Shape

open class ShapeDecorator(decoratedShape: Shape) : Shape
{
  protected val decoratedShape: Shape = decoratedShape

  override fun draw()
  {
    decoratedShape.draw()
  }
}
