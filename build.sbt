name := """progress"""
organization := "terra.do"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"
libraryDependencies ++= Seq(
  guice,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test,
  "org.apache.spark" %% "spark-core" % "3.4.0",
  "org.apache.spark" %% "spark-sql" % "3.4.0"
)

// Override scala-parser-combinators to resolve version conflicts
dependencyOverrides += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"

// Add libraryDependencySchemes to handle version conflicts
libraryDependencySchemes += "org.scala-lang.modules" %% "scala-parser-combinators" % "early-semver"