name := "scala-time"

version := "0.3.1"

scalaVersion := "2.9.1"

scalacOptions ++= Seq( "-unchecked", "-deprecation" )

libraryDependencies ++= Seq(
  "org.joda" % "joda-convert" % "1.2",
  "joda-time" % "joda-time" % "2.1"
)
