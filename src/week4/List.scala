package week4

trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
  //head and tail implemented with parameters and val
}

class Nil[T]() extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil has no head")
  def tail: Nothing = throw new NoSuchElementException("Nil has no tail")
}

object  List {
  // List(1, 2) = List.apply(1, 2)
  def apply[T] (x1: T, y1: T): List[T] =  new Cons(x1, new Cons(y1, new Nil))
  def apply[T] (): List[T] =  new Nil
  
}

