package couresra.week2

object exercise {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //non-tail recursion
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = {
      if (n == 0)
        acc
      else
        loop(acc * n, n - 1)
    }
    loop(1, n);
  }                                               //> factorial: (n: Int)Int
  factorial(4)                                    //> res0: Int = 24

  //tail recursion
  def factorialV2(n: Int): Int = {
    if (n == 0) 1
    else n * factorialV2(n - 1);
  }                                               //> factorialV2: (n: Int)Int
	//195225786
  factorialV2(100)                                //> res1: Int = 0
}