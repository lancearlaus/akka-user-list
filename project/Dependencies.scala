import sbt._

object Version {
  val akka         = "2.3.12"
  val akkaHttp     = "1.0"
  val scala        = "2.11.7"
  val scalaTest    = "2.2.5"
  val scalaLogging = "3+"
}

object Library {
  val akkaHttp      = "com.typesafe.akka"          %% "akka-http-experimental" % Version.akkaHttp
  val akkaTestkit   = "com.typesafe.akka"          %% "akka-testkit"           % Version.akka
  val scalaTest     = "org.scalatest"              %% "scalatest"              % Version.scalaTest
  val scalaLogging  = "com.typesafe.scala-logging" %% "scala-logging"          % Version.scalaLogging
}