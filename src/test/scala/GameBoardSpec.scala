import org.scalatest.{FreeSpec, MustMatchers}

class GameBoardSpec extends FreeSpec with MustMatchers {

  "When the defaultBoard function is called, return the default starting game-board (ASCII art, all empty squares)" in {
    val game = new GameBoard

    game.defaultBoard mustBe (
    "┌─────────────────────────────┐\n" +
    "│    1    │    2    │    3    │\n" +
    "│         │         │         │\n" +
    "│         │         │         │\n" +
    "│         │         │         │\n" +
    "│ ─────────────────────────── │\n" +
    "│    4    │    5    │    6    │\n" +
    "│         │         │         │\n" +
    "│         │         │         │\n" +
    "│         │         │         │\n" +
    "│ ─────────────────────────── │\n" +
    "│    7    │    8    │    9    │\n" +
    "│         │         │         │\n" +
    "│         │         │         │\n" +
    "│         │         │         │\n" +
    "└─────────────────────────────┘\n"
    )

  }

}
