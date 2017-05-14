package week3

import java.util.NoSuchElementException

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