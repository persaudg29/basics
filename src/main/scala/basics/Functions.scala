package basics

object Functions {
  def main(args: Array[String]): Unit = {
    val addOne: Int => String = (x: Int) => (x + 1 + " And your mom's a whore too!").toString
    println(addOne(1))
  }
}
