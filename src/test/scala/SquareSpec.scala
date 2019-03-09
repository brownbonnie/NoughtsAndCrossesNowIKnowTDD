import org.scalatest.{FreeSpec, MustMatchers}

class SquareSpec extends FreeSpec with MustMatchers {

  "When the User chooses a Square, return a new Square with the state changed from empty (default) to their symbol" in {

    val square = Square()

    val newSquare: Square = square.changeState(userSymbol = "X")

    newSquare.state mustBe "X"

  }
}
