name := """gitmap-rest"""

version := "0.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.11",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.11",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "com.ning" % "async-http-client" % "1.7.19",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
