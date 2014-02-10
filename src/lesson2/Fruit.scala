package lesson2

//class in Scala is in same concept with in Java 
class Fruit(color: String) {

  private var _color: String = color;

  //By default classes, objects and class members (fields, methods) are all public.
  def getColor(): String = { return _color }

  def isAbleToEat(): Boolean = { 
    if (color == "red") 
      true 
    else false 
    }

}