import scala.collection.mutable.ListBuffer

object recFunn {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }                                               //> main: (args: Array[String])Unit

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)  //> pascal: (c: Int, r: Int)Int

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def checkParentheses(char: Char): Int = {
      if (char == '(') 1
      else if (char == ')') -1
      else 0
    }

    def balanceAcc(acc: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) (acc == 0)
      else {
        def actual = acc + checkParentheses(chars.head)
        if (actual < 0) false
        else balanceAcc(actual, chars.tail)
      }
    }

    balanceAcc(0, chars)
  }                                               //> balance: (chars: List[Char])Boolean

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def aux(lastMaxCoin: List[(Int, Int)], count: Int): Int = {
      if (lastMaxCoin.isEmpty) count
      else {
        val b = ListBuffer[(Int, Int)]()
        var newCount = count
        for ((lastMaxCoin, total) <- lastMaxCoin) {
          if (total < money) {
            for (c <- coins) {
              if (c >= lastMaxCoin) {
                val e = (c, total + c)
                b += e
              }
            }
          } else if (total == money) newCount += 1
        }
        aux(b.toList, newCount)
      }
    }

    val b = coins.map { c => (c, c) }
    aux(b, 0)
  }}