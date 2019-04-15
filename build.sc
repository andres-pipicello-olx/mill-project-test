import mill._

object foo extends Module {
  def delegatee(string: String) = T.command {
    println(string)
  }

  def works() = T.command {
    println(T.ctx().dest.toString())
    delegatee("dummy")()
  }

  def doesNotWorks() = T.command {
    delegatee(T.ctx().dest.toString())()
  }

}