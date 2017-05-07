import math.abs

object fixedPoint {

	def fixedPoint (f: Double => Double)(firstGuess: Double) = {
	
		val tolerance = 0.0001
		
		def isCloseEnough (x: Double, y: Double): Boolean =
			abs((x - y ) / x) / x < tolerance

		def iterate(guess: Double): Double = {
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
			}
			iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
	
	fixedPoint(x => 1 + x/2)(1.0)             //> res0: Double = 1.999755859375
	
	//Test sqrt
	def sqrt (x: Double):Double = fixedPoint(y => (y + x/y)/2)(1.0)
                                                  //> sqrt: (x: Double)Double
  sqrt(2.0)                                       //> res1: Double = 1.4142135623746899
}