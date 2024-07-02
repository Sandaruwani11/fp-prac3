object Average {

  def Average(num1: Int, num2: Int): Double = {
    val average = (num1 + num2).toDouble / 2
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 17
    val average = Average(num1, num2)
    
    println(s"Arithmetic mean of $num1 and $num2 is: $average")
  }
}
