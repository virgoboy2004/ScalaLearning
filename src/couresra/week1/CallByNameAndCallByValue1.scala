package couresra.week1

/**
 * @author jackzhang
 */
object PassByNameAndPassByValue1 {

  def callByValue(x: Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  def callByName(x: => Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  def main(args: Array[String]): Unit = {
    var index = 1;
    def something(x: Int):Int = {
      println("calling something " + index);
      index = index +1;
      var y =x;
      
      x*x
    }
    
    
    println("call By value")
    callByValue(something(index));
    
    
    println()
    println()
    println("call By name")
    callByName(something(index))

  }

}