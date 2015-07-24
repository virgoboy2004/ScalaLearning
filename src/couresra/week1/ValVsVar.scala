package couresra.week1

/**
 * @author jackzhang
 */
object ValVsVar {

  var name = "string";

  //All of the arguments of function in scala are immutable.
  def mutableMethodParam(x: Int) = {

    //    x = 2; This will cause a compile error 
    var y = x;

    y = y + 1;

    println(y)
    println(x)

  }

  def main(args: Array[String]): Unit = {

    var x = 10;
    //all of the value are passed by value
    mutableMethodParam(x)

    println(x);

    val jack = new Person("Jack");
    val john = new Person("John");
    println(jack)
    println(john)
    
    
    jack.updateAge(30)
    john.updateAge(31);
    
    println(jack)
    println(john)
  }
}

class Person(val name:String, var age:Int = 0) {
//  def updateName (name:String) = this.name = name;      //There will be a compile error
                                                          //because name is declared as "val", so it is immutable
  def updateAge (age:Int) = this.age = age;
  override def toString:String = name + age;
}