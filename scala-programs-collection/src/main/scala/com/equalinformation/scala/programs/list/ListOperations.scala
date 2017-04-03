package com.equalinformation.scala.programs.list

/**
  * Created by bpupadhyaya on 6/20/16.
  */
object ListOperations {
  def main(args: Array[String]): Unit = {
    // Creating list
    val aList = List(1,2,3)
    val bList = List("today","is","sunny")
    val cList = List(1,"today",2,"delta",3.0)
    val emptyList = List()

    val fruitList = "apple" :: "orange" :: "banana" :: Nil

    // List concatenation
    val combinedList = List("a","b") ::: List("c","d")

    // Counting list elements
    val fruitCount = fruitList.count(s => s.length == 6)

    //TODO more list operations to be added


  }
}
