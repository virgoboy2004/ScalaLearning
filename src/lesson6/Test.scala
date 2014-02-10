package lesson6

//This lesson I am going to learn the new type of data in scala, which is Tuple, a tuple is basically a array can store different
//type of data
object Test {

  def test():String = {
    println("Test.test")
    return "something"
  }
  def main(args: Array[String]): Unit = {
    var o = (1,this, Console, Test); // this is same as o = new Tuple4(1,this, Console, Test)
    
    println(o._1)
    println(o._2)
    println(o._3)
    //Scala knows the type of the object when using the index to invoke the object in the tuple 
    println(o._4.test)
    
    
    
    println
    
    o = new Tuple4(1, this, Console, Test)
    
    println(o._1)
    println(o._2)
    println(o._3)
    //Scala knows the type of the object when using the index to invoke the object in the tuple 
    println(o._4.test)
    
  }

}