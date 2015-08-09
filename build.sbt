
lazy val `akka-user-list` = project
  .in(file("."))

name := "akka-user-list"

libraryDependencies ++= List(
  Library.akkaHttp,
  Library.scalaLogging,
  Library.akkaTestkit % "test",
  Library.scalaTest   % "test"
)

