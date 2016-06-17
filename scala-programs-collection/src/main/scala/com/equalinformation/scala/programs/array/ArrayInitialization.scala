package com.equalinformation.scala.programs.array

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object ArrayInitialization extends App {
  val names = Array("Bhim", "Martin", "Spoon")
  names.foreach(name => print(name+","))
  println
  val numbers = Array.apply("zero", "one", "two")
  for(number <- numbers) print(number+",")

}
