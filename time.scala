package First

object totalTime {
  def main(args: Array[String]): Unit = {

    val easypace = 8
    val tempopace = 7

    val easyDistance1 = 2
    val tempoDistance = 3
    val easyDistance2 = 2

    val easyTime1 = easypace * easyDistance1
    val tempoTime = tempopace * tempoDistance
    val easyTime2 = easypace * easyDistance2

    val total_runningTime = easyTime1 + tempoTime + easyTime2

    println(total_runningTime)
  }

}