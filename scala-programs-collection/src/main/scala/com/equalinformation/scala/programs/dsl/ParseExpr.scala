package com.equalinformation.scala.programs.dsl

/**
  * Created by bpupadhyaya on 6/24/16.
  */
object ParseExpression extends Arithmetic {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("Enter expression: ")
    println(parseAll(expr, input))
  }
}

