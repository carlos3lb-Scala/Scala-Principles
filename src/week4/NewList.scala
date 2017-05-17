package week4

trait NewList[T] {

  def isEmpty: Boolean
  def head: T
  def tail: NewList[T]
}

class Cons[T](val head: T, val tail: NewList[T]) extends NewList[T] {
  def isEmpty: Boolean = false
  //head and tail implemented with parameters and val
}

class Nil[T]() extends NewList[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil has no head")
  def tail: Nothing = throw new NoSuchElementException("Nil has no tail")
}

object  NewList {
  // NewList(1, 2) = NewList.apply(1, 2)
  def apply[T] (x1: T, y1: T): NewList[T] =  new Cons(x1, new Cons(y1, new Nil))
  def apply[T] (): NewList[T] =  new Nil
  
}

