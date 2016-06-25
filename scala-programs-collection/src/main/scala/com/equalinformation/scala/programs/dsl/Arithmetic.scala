package com.equalinformation.scala.programs.dsl

import scala.util.parsing.combinator._

/**
  * Due to: Martin Odersky
  * Re-Created by bpupadhyaya on 6/24/16.
  */
class Arithmetic extends JavaTokenParsers {

  //  ***************Grammar for arithmetic expression*********
  //  expr    ::=   term {"+" term | "-" term}.
  //  term    ::=   factor {"*" factor | "/" factor}.
  //  factor  ::=   floatingPointNumber | "(" expr ")".

  def expr: Parser[Any] = term~rep("+"~term | "-"~term)
  def term: Parser[Any] = factor~rep("*"~factor | "/"~factor)
  def factor: Parser[Any] = floatingPointNumber | "("~expr~")"
}
