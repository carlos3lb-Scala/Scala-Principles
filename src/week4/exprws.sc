package week4

object exprws {
	def show(e: Expr): String = e match {
		case Number(n) => n.toString()
		case Sum(e1, e2) => show(e1) + "+" + show(e2)
	}                                         //> show: (e: week4.Expr)String
	
	show(new Sum(new Number(1), new Sum(new Number(2), new Number(3))))
                                                  //> res0: String = 1+2+3
}