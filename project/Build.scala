import sbt._
import sbt.Keys._

object Build extends AutoPlugin {

  override def trigger = allRequirements

  override def projectSettings =
    // Core settings
    List(
      organization := "com.lancearlaus",
      scalaVersion := Version.scala,
      scalacOptions ++= List(
        "-unchecked",
        "-deprecation",
        "-language:_",
        "-target:jvm-1.7",
        "-encoding", "UTF-8"
      ),
      javacOptions ++= List(
        "-source", "1.8",
        "-target", "1.8"
      )
      // unmanagedSourceDirectories.in(Compile) := List(scalaSource.in(Compile).value),
      // unmanagedSourceDirectories.in(Test) := List(scalaSource.in(Test).value)
    )
}