object StringReverseRecursive {

  def reverseStringRecursive(input: String): String = {
    
    if (input.isEmpty) {
      ""
    } else {
      reverseStringRecursive(input.tail) + input.head
    }
  }

  def main(args: Array[String]): Unit = {
    val inputString = "my name is sanda"
    val reversedString = reverseStringRecursive(inputString)
    println(s"Original String: $inputString")
    println(s"Reversed String: $reversedString")
  }
}
