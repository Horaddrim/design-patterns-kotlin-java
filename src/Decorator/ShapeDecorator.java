package Decorator;

import Models.Shape;

public abstract  class ShapeDecorator implements Shape
{
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape)
  {
    this.decoratedShape = decoratedShape;
  }

  @Override
  public void draw()
  {
    decoratedShape.draw();
  }
}
