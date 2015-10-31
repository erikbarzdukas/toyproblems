/**
 * Project Euler 5
 */

object ProblemFive {

  def main(args :Array[String]) {
    var i = 21
    var foundSmallest = false

    while(!foundSmallest) {
      foundSmallest = true

      (2 to 20).foreach((n :Int) => {
        if(foundSmallest) {
          println(i, n, n % i)
          if((i % n) != 0) {
            foundSmallest = !foundSmallest
          }
        }
      })

      i += 1
    }
  
    println(i - 1)
  }
}
