import mill._
import mill.api.Loose
import mill.define.Target
import mill.scalalib.JavaModule
import $file.dir.dep

object foo extends JavaModule {
  override def upstreamAssemblyClasspath: Target[Loose.Agg[PathRef]] = dir.dep.dep.upstreamAssemblyClasspath
}