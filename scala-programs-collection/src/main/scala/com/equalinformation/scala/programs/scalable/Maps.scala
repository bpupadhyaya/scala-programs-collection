package com.equalinformation.scala.programs.scalable

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object Maps {
  def main(args: Array[String]): Unit = {
    var universities = Map("Palo Alto" -> "Stanford", "Berkeley" -> "UC Berkeley", "Massachusetts" -> "MIT")
    universities += ("Harvard" -> "Harvard University")
    println("Harvard")
  }

}
