/**
 * Project Euler 6
 */

object problem6 {

  def main(args: Array[String]) {
    val sumSquares = (1 to 100).foldLeft(0) ((sum: Int, current: Int) => {
      sum + current * current
    })

    val sums = (1 to 100).foldLeft(0) ((sum: Int, current: Int) => {
      sum + current
    })

    val squareSums = sums * sums

    println(sumSquares - squareSums)
    println(squareSums - sumSquares)
  }
}
