package lesson7
/**
 * This lesson I am going to study the new feature in Scala - trait
 * trait is kind of mix of interface and abstract class in java, 
 * 	1, A trait can has both implemented function and unimplemented functions
 *  2, A class can inherits multiple traits
 *   
 * 
 * * */
object Test {

  def main(args: Array[String]): Unit = {
    var pdf = new PdfBook("Learning Scala")
    pdf.setContext("I have this pdf copy, so I can read this book by using my ipad")
    var paper = new PaperBook("Lerning Scala")
    paper.setContext("I do not have the pdf copy....")
    
    
    println(pdf.getContext()) 
    
    
    println(paper.getContext())
    
    
    
    println(paper.paperPublished )
    
    
  }

}