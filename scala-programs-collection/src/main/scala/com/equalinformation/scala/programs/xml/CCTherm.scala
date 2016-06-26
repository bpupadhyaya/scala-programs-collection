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

  override def toString = description

  def toXML =
    <cctherm>
      <description>{description}</description>
      <yearMade>{yearMade}</yearMade>
      <dateObtained>{dateObtained}</dateObtained>
      <bookPrice>{bookPrice}</bookPrice>
      <purchasePrice>{purchasePrice}</purchasePrice>
      <condition>{condition}</condition>
    </cctherm>

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

  println(therm.toXML)
}
