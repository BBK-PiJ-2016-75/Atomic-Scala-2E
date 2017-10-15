// Exercise05.sc

class FlexibleFamily(parent1: String = "Mom", parent2: String = "Dad", children: String*) {
  def familySize: Int = {
    var size = 2
    for (_ <- children) {
      size += 1
    }
    size
  }
}
