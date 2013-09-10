package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object ZlibDevel extends Bundle() {

  val metadata = generated.metadata.ZlibDevel

  def install[D <: AnyDistribution](distribution: D): InstallResults =
    Seq("yum", "install", "zlib-devel", "-y") ->- success(metadata+" is installed")

}
