// Name.scala
package com.atomicscala

import scala.reflect.runtime.currentMirror

object Name {
  def className(o: Any): String =
    currentMirror.reflect(o).symbol.toString.replace('$', ' ').split(' ').last
}

trait Name {
  override def toString: String =
    Name.className(this)
}
