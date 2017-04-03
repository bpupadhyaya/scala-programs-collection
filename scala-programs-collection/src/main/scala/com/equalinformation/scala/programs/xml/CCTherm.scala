package com.equalinformation.scala.programs.xml


/**
  * Due to: Martin Odersky
  * Re-Created by bpupadhyaya on 6/25/16.
  */
abstract class CCTherm {
  val description: String
  val yearMade: Int
  val dateObtained: String
  val bookPrice: Int
  val purchasePrice: Int
  val condition: Int

  override def toString = description+","+yearMade

  def toXML =
    <cctherm>
      <description>{description}</description>
      <yearMade>{yearMade}</yearMade>
      <dateObtained>{dateObtained}</dateObtained>
      <bookPrice>{bookPrice}</bookPrice>
      <purchasePrice>{purchasePrice}</purchasePrice>
      <condition>{condition}</condition>
    </cctherm>

  def fromXML(node: scala.xml.Node): CCTherm =
    new CCTherm {
      override val description = (node \ "description").text
      override val yearMade = ( node \ "yearMade").text.toInt
      override val dateObtained = (node \ "dateObtained").text
      override val bookPrice = (node \ "bookPrice").text.toInt
      override val purchasePrice = (node \ "purchasePrice").text.toInt
      override val condition = (node \ "condition").text.toInt
    }
}


object SampleXMLSerialization extends App {
  val therm = new CCTherm {
    override val description: String = "Test description"
    override val yearMade: Int = 2016
    override val dateObtained: String = "Apr 17, 2016"
    override val bookPrice: Int = 345
    override val purchasePrice: Int = 200
    override val condition: Int = 8
  }

  val node = therm.toXML
  println("Serialization: "+node)

  println("Deserialization: "+therm.fromXML(node))

  def identify(node: scala.xml.Node): String =
    node match {
      case <description>{content}</description> => "Description: "+content
      case <yearMade>{content}</yearMade> => "Year made: "+content
  }

  println("Identification: "+identify(<description>Pattern matching</description>))
}
