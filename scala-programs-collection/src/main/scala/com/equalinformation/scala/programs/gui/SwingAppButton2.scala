package com.equalinformation.scala.programs.gui

import scala.swing._
import scala.swing.event.ButtonClicked

/**
  * Created by bpupadhyaya on 6/23/16.
  */
object SwingAppButton2 extends SimpleSwingApplication {
  override def top: Frame = new MainFrame {
    title = "Swing App with Button - 2"
    val button = new Button {
      text = "Click here"
    }

    val label = new Label {
      text = "No button clicked yet"
    }

    contents = new BoxPanel(Orientation.Vertical) {
      contents += button
      contents += label
      border = Swing.EmptyBorder(30,40,15,40)
    }

    listenTo(button)
    var nClicks = 0
    reactions += {
      case ButtonClicked(b) =>
        nClicks += 1
        label.text = "Number of button clicks: "+nClicks
    }
  }
}
