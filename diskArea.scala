package First

object DiskArea {
  def main(args: Array[String]): Unit = {
    val radius =5
    val area=areaofDisk(radius)
    println(area)
  }

  def areaofDisk(radius:Int):Double = {
    val pi = 3.14
    pi*radius*radius
  }
}