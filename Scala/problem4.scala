/**
 * Project Euler 4
 * Inefficient solution
 */
import scala.math.BigInt

object problem4 {
  def isPalindrome(numberToCheck :Int) :Boolean = {
    var stringToCheck = numberToCheck.toString()
    val middle = stringToCheck.length / 2
    var i = 0

    while(i < middle) {
      if(stringToCheck(i) != stringToCheck(stringToCheck.length - 1 - i)) {
        return false
      }

      i += 1
    }

    return true
  }

  def main(args: Array[String]) {
    var biggest = 0

    (100 until 1000).foreach((n :Int) => {
      (100 until 1000).foreach((x :Int) => {
      
        if(isPalindrome(n * x) &&
           n * x > biggest) {
             biggest = n * x
           }
      })
    })

    println(biggest)
  }
}
