package lesson7

class PdfBook(name:String) extends Readable {

  this.context = name;
 
  def setContext(context: String): Unit = {this.context  = this.context  + ": This is a PDF book\n"+context} 

}