package com.equalinformation.scala.programs.actor

import akka.actor.{Props, ActorSystem, Actor}

/**
  * Created by bpupadhyaya on 6/25/16.
  */
class SampleActor extends Actor {
  override def receive: Receive = {
    case "scala" => println("Received scala")
    case "java" => println("Received java")
    case "python" => println("Received python")
    case default => println("Default")
  }
}

object Main extends App {
  val system = ActorSystem("SampleActorSystem")
  val sampleActor = system.actorOf(Props[SampleActor],"testactor")
  sampleActor ! "scala"
  sampleActor ! "python"
  sampleActor ! "nothing"

}
