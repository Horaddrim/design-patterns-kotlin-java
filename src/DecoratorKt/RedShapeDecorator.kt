package DecoratorKt

import KotlinModels.Shape

class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape)
{
  override fun draw() {
    decoratedShape.draw()
    setRedBorderDecoration(decoratedShape)
  }

  private fun  setRedBorderDecoration(decoratedShape: Shape)
  {
    println("Border Color : Red")
    decoratedShape.draw()
  }
}
