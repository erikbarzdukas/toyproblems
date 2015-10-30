def fibonnaci(n :Int) :Long = {
  def fib_tail(n :Int, a :Long, b :Long) :Long = n match {
    case 0 => a
    case _ => fib_tail(n-1, b, a+b)
  }

  return fib_tail(n, 0, 1)
}

var total :Long = 0
var currentFibValue :Long = 0
var currentSeed :Int = 1

while(currentFibValue < 4000000) {
  currentFibValue = fibonnaci(currentSeed) 
  if(currentFibValue % 2 == 0) total += currentFibValue
  currentSeed += 1
}

println(total)
