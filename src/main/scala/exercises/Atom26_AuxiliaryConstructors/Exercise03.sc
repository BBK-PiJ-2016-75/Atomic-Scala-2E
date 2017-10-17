// Exercise03.sc

class Person(val name: String, val age: Int) {
  def this(name: String) = {
    //    val height = 183 // Not possible
    this(name, 0)
  }
}
