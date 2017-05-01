package week1

object sqrt {

  // Absolute function
  def abs(x: Double): Double = if (x >= 0) x else -x
                                                  //> abs: (x: Double)Double

  // SQRT using a Block
  def sqrt(x: Double): Double = {
  
    def sqrtIter(gess: Double): Double =
      if (isGoodEnough(gess)) gess
      else sqrtIter(improve(gess))

    def isGoodEnough(gess: Double): Boolean =
      abs(gess * gess - x) / x < 0.001

    def improve(gess: Double): Double =
      (gess + x / gess) / 2

    sqrtIter(1)
  }                                               //> sqrt: (x: Double)Double

  sqrt(25)                                        //> res0: Double = 5.000023178253949
  sqrt(4)                                         //> res1: Double = 2.000609756097561
  sqrt(1e-6)                                      //> res2: Double = 0.0010000001533016628
  sqrt(1e10)                                      //> res3: Double = 100005.58643074983
}