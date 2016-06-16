package com.equalinformation.scala.programs.algo

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object Max {

  def max(x: Int, y: Int): Any = {
    if (x > y) x else y
  }

  def main(args: Array[String]): Unit = {
    println(max(5, 6));
  }

}
