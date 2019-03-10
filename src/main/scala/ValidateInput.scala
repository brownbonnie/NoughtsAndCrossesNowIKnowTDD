import scala.annotation.tailrec
import scala.io.StdIn

class ValidateInput {

  @tailrec
  final def getUserInputUntilValid(validItems: List[String]): String = {
    val input = StdIn.readLine.trim

    if (validItems.contains(input)) {
      input
    }
    else {
      println(s"Please choose one of the following: ${validItems.mkString(", ")}")
      getUserInputUntilValid(validItems)
    }
  }

}
