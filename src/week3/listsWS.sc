package week3

object listsWS {

  def elementAt[T](list: List[T], n: Int): T = {
    def aux(list: List[T], position: Int): T =
      if (list.isEmpty) throw new IndexOutOfBoundsException("List size exceded")
      else if (position == n) return list.head
      else return aux(list.tail, position + 1)

    aux(list, 0)

  }                                               //> elementAt: [T](list: week3.List[T], n: Int)T
  
  val list: List[Int] = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week3.List[Int] = week3.Cons@2812cbfa
                                                  
	elementAt(list, 2)                        //> res0: Int = 3
	elementAt(list, 5)                        //> java.lang.IndexOutOfBoundsException: List size exceded
                                                  //| 	at week3.listsWS$$anonfun$main$1.aux$1(week3.listsWS.scala:7)
                                                  //| 	at week3.listsWS$$anonfun$main$1.elementAt$1(week3.listsWS.scala:11)
                                                  //| 	at week3.listsWS$$anonfun$main$1.apply$mcV$sp(week3.listsWS.scala:18)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.listsWS$.main(week3.listsWS.scala:3)
                                                  //| 	at week3.listsWS.main(week3.listsWS.scala)
  
  

}