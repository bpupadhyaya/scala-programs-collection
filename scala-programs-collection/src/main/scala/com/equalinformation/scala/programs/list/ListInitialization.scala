package com.equalinformation.scala.programs.list

/**
  * Created by bpupadhyaya on 6/16/16.
  */
object ListInitialization extends App {

  val sampleNumbers = List(1,2,3,4,5)

  for(number <- sampleNumbers) print(number+",")

  println

  val sampleNames = List.apply("Bhim", "Michael")

  sampleNames.foreach(name => print(name+","))

}
