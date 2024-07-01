object SumOfEvenNumbers{

  def sumOfEvenNumbers(nums: List[Int]): Int = {
    nums.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(2, 11, 24, 5, 16, 7, 14, 8, 19, 45)
    val sumOfEvens = sumOfEvenNumbers(numbers)
    
    println(s"List: ${numbers.mkString(", ")}")
    println(s"Sum of even numbers: $sumOfEvens")
  }
}
