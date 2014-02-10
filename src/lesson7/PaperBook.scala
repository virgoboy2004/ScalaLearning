package lesson7

class PaperBook(name:String) extends PaperPublished with Readable {
  this.context  = name
  def setContext(context: String): Unit = {this.context  = this.context +": This is a paper book\n"+context} 

}