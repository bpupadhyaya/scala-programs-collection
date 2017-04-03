package com.equalinformation.scala.programs.gui

import scala.swing._
import scala.swing.event.EditDone

/**
  * Due to : Martin Odersky
  * Re-Created by bpupadhyaya on 6/23/16.
  */
object TemperatureConverter extends SimpleSwingApplication {
  override def top: Frame = new MainFrame {
    title = "Celsius to Fahrenheit Converter"

    object celsius extends TextField { columns = 5}
    object fahrenheight extends TextField {columns = 5}

    contents = new FlowPanel {
      contents += celsius
      contents += new Label(" Celsius = ")
      contents += fahrenheight
      contents += new Label(" Fahrenheight")
      border = Swing.EmptyBorder(10,15,15,15)
    }

    listenTo(celsius, fahrenheight)

    reactions += {
      case EditDone(`fahrenheight`) =>
        val f = fahrenheight.text.toInt
        val c = (f - 32) * 5 / 9
        celsius.text = c.toString
      case EditDone(`celsius`) =>
        val c = celsius.text.toInt
        val f = c * 9 / 5 + 32
        fahrenheight.text = f.toString
    }
  }
}
