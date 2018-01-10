object Activity {

  def main(args: Array[String]): Unit = {
    val process = new Application
    val firstElement: Int = 2
    val secondElement: Int = 3
    val thirdElement: Int = 4

    val firstList = List(firstElement, secondElement, thirdElement)
    println(process.doubleElements(firstList))

    val fourthElement: Int = 4
    val fifthElement: Int = 5
    val sixthElement: Int = 6

    val secondList = List(fourthElement, fifthElement, sixthElement)
    println(process.sumOfTwoList(firstList, secondList))

    println(process.reverseList(firstList))
    val count = 1
    val partial = process.numberOfElementInList(count,_:List[Int])
    println(partial(firstList))

    val location:Int = 2
    println(process.kthElementOfList(location,firstList))

  }
}





class Application {

  def doubleElements(firstList: List[Int]):List[Int] = {
    require(! firstList.isEmpty)
    firstList.map(_ * 2)
  }

  def sumOfTwoList(firstList: List[Int], secondList: List[Int]): List[Int] = {
    require(firstList.length == secondList.length)
    (firstList, secondList).zipped.map(_ + _)

  }

  def reverseList(firstList: List[Int]): List[Int] = {
    val reverseList =
      for(endIndex <- firstList.length - 1 until -1 by -1)
    yield firstList(endIndex)
    reverseList.toList



  }

  def numberOfElementInList(count: Int, firstList: List[Int]): Int = {
    firstList match {
      case head :: body :: tail => numberOfElementInList(count + 1, body :: tail)
      case head :: Nil => count
    }
  }

  def kthElementOfList(location: Int, firstList: List[Int]): Int = {
    firstList(location)
  }





}
