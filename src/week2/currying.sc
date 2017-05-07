object currying {

	//Function to calculate product of a funtion between intervals
	def product (f: Int => Int) (a: Int, b: Int): Int =
		if (a > b) 1
		else f(a) * product(f)(a+1,b)     //> product: (f: Int => Int)(a: Int, b: Int)Int
	
	product(x =>x)(1, 5)                      //> res0: Int = 120
	
	//Function to calculate factorial using product
	def factorial(n: Int) =	product(x => x)(1, n)
                                                  //> factorial: (n: Int)Int
	factorial(5)                              //> res1: Int = 120
		
	// Common function to sum and product
	def mapReduce (f: Int => Int, combine: (Int, Int) => Int, zero: Int) (a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
			 
	mapReduce(x => x, (a,b) => a * b, 1)(1, 5)//> res2: Int = 120
	mapReduce(x => x, (a,b) => a + b, 0)(1, 5)//> res3: Int = 15
	
	def product2 (f: Int => Int) (a: Int, b: Int): Int  = mapReduce (f, (x, y) => x*y, 1)(a,b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
	
	product2(x =>x)( 1, 5)                    //> res4: Int = 120
		
	
}