package lesson2

//This lesson, I am trying to understand what is the difference between object and class in scala
object Test {
  
  def main(args: Array[String]): Unit = {
    
    //Create a instance of class Fruit, and set its color to 'yellow'
    var orange:Fruit = new Fruit("yellow");
    
    
    println("The color of the orange is: " + orange.getColor);
    
    //Get the apple instance, remember there is only one apple instance in the application..
    var apple = Apple;
    
    println("The color of the apple is: "+apple.getColor);
    
    
    println(apple.isDone);
    //compile error, since the _color is "private"
//    apple._color;
    
    apple.eat;
    
    println(apple.isDone);
    
  }

}