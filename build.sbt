name := "scala-time"

version := "0.3.1"

scalaVersion := "2.10.2"

scalacOptions ++= Seq( "-unchecked", "-deprecation" )

libraryDependencies ++= Seq(
  "org.joda" % "joda-convert" % "1.3.1",
  "joda-time" % "joda-time" % "2.2"
)

isSnapshot := true

publishTo := Some( Resolver.file("file", new File( Path.userHome.absolutePath + "/dev/dmrolfs.github.com/snapshots" ) ) )
