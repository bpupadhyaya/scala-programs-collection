package com.equalinformation.scala.programs.loop

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object Foreach {
  def main(args: Array[String]): Unit = {
    val a = List(1,2,3,4)
    a.foreach(println)
    println
    a.foreach(arg => print(arg+","))
    println
    a.foreach((arg: Int) => print(arg+","))
    println
    for(arg <- a) {
      print(arg + ",")
    }
  }
// testing commit
}
