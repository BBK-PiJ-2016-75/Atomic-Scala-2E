// Exercise04.sc

class FlexibleFamily(parents: String*, children: String*) {
  def familySize: Int = {
    var size = 2
    for (_ <- children) {
      size += 1
    }
    size
  }
}
