// Exercise06.sc
import com.atomicscala.AtomicTest._

val drawing = new Drawing(new Rectangle, new Square, new Ellipse, new Circle)

trait Shape {
  def draw: String
}

class Ellipse extends Shape {
  override def draw: String = "Ellipse"
}

class Rectangle extends Shape {
  override def draw: String = "Rectangle"
}

class Circle extends Ellipse {
  override def draw: String = "Circle"
}

class Square extends Rectangle {
  override def draw: String = "Square"
}

class Drawing(shapes: Shape*) {
  val drawingShapes = shapes.toVector

  override def toString: String = draw.mkString(", ")

  def draw: Vector[String] = for (shape <- drawingShapes) yield shape.draw
}

drawing.draw is "Vector(Rectangle," + " Square, Ellipse, Circle)"
drawing is "Rectangle, Square," + " Ellipse, Circle"
