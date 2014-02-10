package lesson3

import scala.actors.Actor

//I am going to write some code to use the function way in Scala
//This is going to be exciting  
object Test {

  def main(args: Array[String]): Unit = {
    
    var teacher = new Teacher
    var student = new Student
    var firstClass = new ComputerScienceClass(teacher.startClass, teacher.endClass, student.startClass, student.endClass)
    
    firstClass.start()
    firstClass.end()
    
  }

}