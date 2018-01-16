package com.atomicscala

import scala.reflect.runtime.currentMirror

object Name2 {
  def className(o: Any): String =
    currentMirror.reflect(o).symbol.toString
}

trait Name2 {
  override def toString: String =
    Name2.className(this)
}
