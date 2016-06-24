package com.equalinformation.scala.programs.gui

import scala.swing._

/**
  * Created by bpupadhyaya on 6/23/16.
  */
object ButtonSwingApp { // extends SimpleGUIApplication - deprecated
  def main(args: Array[String]): Unit = {
    def top = new MainFrame {
      title = "Button Swing App"
      contents = new Button {
        text = "Click here"
      }
    }
  }

}
