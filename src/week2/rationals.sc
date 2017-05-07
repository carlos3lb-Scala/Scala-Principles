class Rational(x: Int, y:Int) {

	require (y != 0, "denominator must be nonzero")

	private val g = gcd(x,y)
	def numerator = x / g
	def denominator = y / g
	
	def + (r: Rational) =
		new Rational(
			numerator * r.denominator + r.numerator * denominator,
			denominator * r.denominator)
			
	def neg : Rational = new Rational(-numerator, denominator)
	
	def - (r: Rational): Rational = this + (r.neg)
	 
	override def toString (): String = numerator + "|" + denominator
	
	private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
}

object rationals {

	val r = new Rational(1, 2)                //> r  : Rational = 1|2
	
	(r + new Rational(2,2)).toString()        //> res0: String = 3|2
	
	val x = new Rational(1, 3)                //> x  : Rational = 1|3
	val y = new Rational(5, 7)                //> y  : Rational = 5|7
	val z = new Rational(3, 2)                //> z  : Rational = 3|2
	
	x - y - z                                 //> res1: Rational = -79|42
	y + y                                     //> res2: Rational = 10|7
	
}