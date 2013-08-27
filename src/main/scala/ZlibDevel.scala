package ohnosequences.statika

import ohnosequences.statika._

case object ZlibDevel extends Bundle() {

  val metadata = generated.metadata.ZlibDevel

  def install[D <: DistributionAux](distribution: D): InstallResults = {
    // do someting here
    success("%s is installed" format metadata)
  }

}
