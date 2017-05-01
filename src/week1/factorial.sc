package week1

import scala.util.control.TailCalls.TailRec

object factorial {

	def factorial(x: Int): Int =
		if (x == 0) 1 else x * factorial(x - 1)
                                                  //> factorial: (x: Int)Int

	factorial(4)                              //> res0: Int = 24
	
	// Tail Recursive Version
	def factorialTR(x: Int): Int = {
	
		def aux(x: Int, total: Int): Int =
			if (x == 0) total else aux(x - 1, x * total)
   
   	aux(x, 1)
  }                                               //> factorialTR: (x: Int)Int
  
  factorialTR(4)                                  //> res1: Int = 24
		
}