// Exercise05.sc

class FlexibleFamily(children: String*, parent1: String, parent2: String) {
  def familySize: Int = {
    var size = 2
    for (_ <- children) {
      size += 1
    }
    size
  }
}
