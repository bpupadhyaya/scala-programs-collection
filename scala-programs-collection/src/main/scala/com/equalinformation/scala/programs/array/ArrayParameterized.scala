package com.equalinformation.scala.programs.array

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object ArrayParameterized {
  def main(args: Array[String]): Unit = {
    val testString = new Array[String](2)
    testString(0) = "Hi"
    testString(1) = "Odersky"

    for(i <- 0 to 1) {
      println(testString(i))
    }
  }

}
