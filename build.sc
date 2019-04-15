import mill._

object foo extends Module {
  def delegatee(string: String) = T.command {
    println(string)
  }

  def delegator() = T.command {
    delegatee(T.ctx().dest.toString())()
  }
}