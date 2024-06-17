package First

object SphereVolume {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = volumeOfSphere(radius)
    println(volume)
  }

  def volumeOfSphere(radius:Int): Double = {
    val pi =3.14
    (4.0/3.0)*pi*radius*radius*radius
  }
}