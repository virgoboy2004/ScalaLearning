package lesson4

import scala.io.Source
import scala.reflect.io.File

/**
 * I am going to learn I/O in scala
 * 
 * 
 * 
 * Looks like Scala does not have a very story I/O API in this moment, I will recommend using Java I/O API if you want better 
 * performance and wider support, such as reading Excel file etc.
 */
object Test {

  def main(args: Array[String]): Unit = {
    
    //This code does not work, not sure why, tring to find help from internet.
    // http://stackoverflow.com/questions/19650248/simple-file-read-with-scala-does-not-work
    var filePath = Source.getClass().getResource("/lesson4/test.txt")
    var file = Source.fromURL(filePath)
    var lines = file.getLines
    lines.foreach(println)
    file.close
    
  }

}