name := "Testing Scala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.6" % "test" withSources() withJavadoc(),
  "joda-time" % "joda-time" % "2.10" withSources() withJavadoc(),
  "junit" % "junit" %"4.10" withSources() withJavadoc(),
  "org.joda" % "joda-convert" % "2.2.0" withSources() withJavadoc(),
  "org.testng" % "testng" % "6.1.1" % "test" withSources() withJavadoc())