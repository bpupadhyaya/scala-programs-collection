package com.equalinformation.scala.programs.fileio

import scala.io.Source

/**
  * Created by bpupadhyaya on 6/20/16.
  */
object FileIOOperations extends App {
  if (args.length > 0) {
    for(line <- Source.fromFile(args(0)).getLines().toList)
      println(line)
  } else {
    Console.err.println("Please supply file!")
  }

}
