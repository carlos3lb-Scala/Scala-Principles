package week4

object lists {

	def isort(list: List[Int]): List[Int] = list match {
		case List() => List()
		case head :: tail => insert(head, isort(tail))
	}                                         //> isort: (list: List[Int])List[Int]
	
	def insert(x: Int, list: List[Int]): List[Int] = list match {
		case List() => List(x)
		case head :: tail => if (x <= head) x :: list else head :: insert(x, tail)
	}                                         //> insert: (x: Int, list: List[Int])List[Int]
	
	def prueba: List[Int] = 1 :: 4 :: 6 :: 2 :: Nil
                                                  //> prueba: => List[Int]
	
	isort(prueba)                             //> res0: List[Int] = List(1, 2, 4, 6)

}