package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object ZlibDevel extends Bundle() {

  val metadata = generated.metadata.ZlibDevel

  def install[D <: DistributionAux](distribution: D): InstallResults = {
    val result = Seq("yum", "install", "zlib-devel", "-y").!
    if (result == 0) success(metadata+" is installed")
    else failure("Couldn't install "+metadata)
  }

}
