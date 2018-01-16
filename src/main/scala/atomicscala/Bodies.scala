// Bodies.scala
package com.atomicscala

class NoBody {
  def anyBody: String = {
    "Nobody"
  }
}

class SomeBody {
  val name = "Jane Doe"

  def anyBody: String = {
    name
  }
}

class EveryBody {
  val all = Vector(new SomeBody, new SomeBody, new SomeBody)
}
