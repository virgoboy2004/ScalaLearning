package lesson3

class ComputerScienceClass (callBackForStartTeacher:() => Unit, callBackForEndTeacher:() => Unit,
    callBackForStartStudent:() => Unit, callBackForEndStudent:() => Unit){
  
  def start() = {
    callBackForStartStudent()
    callBackForStartTeacher()
  }
  
  def end() = {
    callBackForEndTeacher()
    callBackForEndStudent()
  }

}