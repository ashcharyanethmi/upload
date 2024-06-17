package First

object celciusToFahrenheit {
  def main(args: Array[String]): Unit = {
    val celcius = 35
    val fahrenheit = temperature_into_Fahrenheit(celcius)
    println(fahrenheit)
  }

  def temperature_into_Fahrenheit(celcius:Int): Double = {
    celcius*1.8000*32.00
  }
}