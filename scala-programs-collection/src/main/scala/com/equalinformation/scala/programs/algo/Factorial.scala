package com.equalinformation.scala.programs.algo

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object Factorial {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
  }

  def factorial(x: BigInt): BigInt = {
    if (x == 0) 1 else
    x * factorial(x - 1)
  }
}
