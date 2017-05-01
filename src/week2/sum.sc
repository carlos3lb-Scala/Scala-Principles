package week2

object sum {

	// Sum function numbers between two values (included)
	def sum (f: Int => Int, a: Int, b: Int) = {
		
		def loop (a: Int, acc: Int): Int =
			if (a > b) acc else loop (a + 1, acc + f(a))
			
		loop (a, 0)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	sum (x => x, 1, 5)                        //> res0: Int = 15
	sum (x => x*x, 1, 5)                      //> res1: Int = 55
	
	
}