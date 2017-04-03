package com.equalinformation.scala.programs.list

/**
  * Created by bpupadhyaya on 6/21/16.
  */
object SimpleListApp_AI_1 {
  def main(args: Array[String]): Unit = {
    val paragraph = scala.io.StdIn.readLine("Please enter three word English sentences: ")

    val words = paragraph.split(" ")

    val sentences = Nil
    val currentSentence = Nil

    for(word <- words) {
      if(word.endsWith(".")) {
        word.stripSuffix(".")
        //TODO list concatenation with constant time, do not use ListBuffer
//        currentSentence = word :: currentSentence
        currentSentence.reverse

//        sentences = currentSentence :: sentences
      } else {
//        currentSentence = word :: currentSentence
      }
    }
    sentences.reverse

    //TODO now each sentence is a list of words, apply grammar rules for analysis

  }

}
