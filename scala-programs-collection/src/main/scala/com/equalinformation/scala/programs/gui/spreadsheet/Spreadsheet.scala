package com.equalinformation.scala.programs.gui.spreadsheet

import scala.swing._


/**
  * Due to: Martin Odersky
  * Re-Created by bpupadhyaya on 6/24/16.
  */
class Spreadsheet(val height: Int, val width: Int) extends ScrollPane {
  val cellModel = new Model(height, width)

  val table = new Table(height, width) {
    rowHeight = 25
    autoResizeMode = Table.AutoResizeMode.Off
    showGrid = true
    gridColor = new java.awt.Color(150,150,150)

/*    def renderComponent(isSelected: Boolean, hasFocus: Boolean,
      row: Int, column: Int): Component = {
      if(hasFocus) new TextField(userData(row, column)) else
        new Label(cells(row)(column).toString) {
          xAlignment = Alignment.Right
        }
    }

    def userData(row: Int, column: Int): String = {
      val v = this(row, column)
      if(v == null) "" else v.toString
    }*/
  }

  //TODO Check for row-numbers
  val rowHeader = new ListView(0 until height) {
    fixedCellWidth = 30
    fixedCellHeight = table.rowHeight
  }

/*  val rowHeader = new ListView(0 until height) map (_.toString) {
    fixedCellWidth = 30
    fixedCellHeight = table.rowHeight
  }*/

  viewportView = table
//  rowHeaderView = rowHeader
}
