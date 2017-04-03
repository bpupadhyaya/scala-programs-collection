package com.equalinformation.scala.programs.gui.spreadsheet

/**
  * Due to: Martin Odersky
  * Re-Created by bpupadhyaya on 6/24/16.
  */
class Model(val height: Int, val width: Int) {
  case class Cell(row: Int, column: Int)

  //TODO check why it did not take width
  val cells = new Array[Array[Cell]](height)
//  val cells = new Array[Array[Cell]](height, width)

  for(i <- 0 until height; j <- 0 until width)
    cells(i)(j) = new Cell(i,j)
}
