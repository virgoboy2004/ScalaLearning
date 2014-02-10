package lesson2


//This is an Object, Object is very similar with Singleton class we have in java.
//An instance of a class which is guaranteed to be unique. For every object in the code, 
//an anonymous class is created, which inherits from whatever classes you declared object to implement. 
//This class cannot be seen from Scala source code -- though you can get at it through reflection.
object Apple extends Fruit("red") {
  
  
  private var done: Boolean = false

  def eat() = if (isAbleToEat) {
    println("I am eating this BIG RED Apple.")
    done = true
  }

  def isDone(): String = if (done) {
    "The apple has been eaten."
  } else {
    "The apple is still there, you want to eat it? Dream on........."
  }

}