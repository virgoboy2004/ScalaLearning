package couresra.week1

/**
 * @author jackzhang
 */
object PassByNameAndPassByValue {

  def callByValue(x: Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  def callByName(x: => Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  def main(args: Array[String]): Unit = {
    
    def something(x: Int):Int = {
      println("calling something");
      var y =x;
      
      x*x
    }
    
    
    println("call By value")
    callByValue(something(2));
    
    
    println()
    println()
    println("call By name")
    callByName(something(4))

  }

}