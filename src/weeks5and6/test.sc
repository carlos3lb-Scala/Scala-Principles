package weeks5and6

object test {

  val xs = Array(1, 2, 3, 44)                     //> xs  : Array[Int] = Array(1, 2, 3, 44)
  xs map ( x => x * 2 )                           //> res0: Array[Int] = Array(2, 4, 6, 88)

  val s = "Carlos Lopez"                          //> s  : String = Carlos Lopez
  s filter (x => x.isUpper)                       //> res1: String = CL

  s exists (x => x.isWhitespace)                  //> res2: Boolean = true
  s forall (x => x.isWhitespace)                  //> res3: Boolean = false
  
  val pairs = List(1,2,3) zip s                   //> pairs  : List[(Int, Char)] = List((1,C), (2,a), (3,r))
  pairs.unzip                                     //> res4: (List[Int], List[Char]) = (List(1, 2, 3),List(C, a, r))
  s flatMap (x => List(x, '.'))                   //> res5: String = C.a.r.l.o.s. .L.o.p.e.z.
  
  xs.sum                                          //> res6: Int = 50
  xs.max                                          //> res7: Int = 44

	def isPrime(x: Int): Boolean = (2 until x) forall (n => x % n != 0)
                                                  //> isPrime: (x: Int)Boolean
	isPrime(5)                                //> res8: Boolean = true
	isPrime(8)                                //> res9: Boolean = false
}