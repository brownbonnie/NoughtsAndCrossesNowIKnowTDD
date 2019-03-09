case class Square(state: String = "") {

  def changeState(userSymbol: String) = Square(state = userSymbol)

}
