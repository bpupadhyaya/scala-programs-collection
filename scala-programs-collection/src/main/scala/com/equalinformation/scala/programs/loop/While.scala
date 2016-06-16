package com.equalinformation.scala.programs.loop

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object While {

  def whileTest(i: Int): Any = {
    var j = 0
    while (j < i) {
      println(j)
      j += 1
    }
  }

  def main(args: Array[String]): Unit = {
    whileTest(5)
  }
}
