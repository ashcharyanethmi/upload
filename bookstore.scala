package First

object Main {
  def main(args: Array[String]): Unit = {
    val numOFcopies =60
    val totalCost = total_wholesale_cost(numOFcopies)
    println(totalCost)
  }

  def total_wholesale_cost(numOFcopies : Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val first50shippingcost = 3.0
    val additionalshippingcost = 0.75

    val discount_price_perBook = coverPrice * (1-discount)
    val discount_price_AllBooks = discount_price_perBook * numOFcopies

    val shippingCost = if(numOFcopies<=50){
      first50shippingcost
    }else{
      first50shippingcost + (numOFcopies-50) * additionalshippingcost
    }

    discount_price_AllBooks + shippingCost
  }
}