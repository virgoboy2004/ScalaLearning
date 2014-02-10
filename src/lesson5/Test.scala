package lesson5

import scala.io._
import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter

//This lesson I am going to write some code for using closure
//Basically, a closure is a function, whose return value depends on one or more variables are defined outside the function
//  Not sure why they call it as closure, it sounds just like a function for me
object Test {
  def main(args: Array[String]) {
	  var a = 10;
	  
	  var i = (i:Int) => i*a
	  
	  
	  println(i(2))
	  
	  
	  println(i(4))
  }
}