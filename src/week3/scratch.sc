package week3

import rationals.Rational //._ to use all in rationals, .{x,y} to concrete objects

object scratch {

	new Rational(1, 2)
	
	def error(msg: String) = throw new Error(msg)
	
	error("test")

}