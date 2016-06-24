package com.equalinformation.scala.programs.gui.spreadsheet

import scala.swing._

/**
  * Due to: Martin Odersky
  * Re-Created by bpupadhyaya on 6/24/16.
  */
object Main extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Sample Sheet"
    contents = new Spreadsheet(100,30)
  }

}
