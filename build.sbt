name := "plsql-lint-server"

version := "1.0.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.tumblr" %% "colossus" % "0.8.3",
  "io.circe" %% "circe-core" % "0.7.0",
  "io.circe" %% "circe-generic" % "0.7.0",
  "io.circe" %% "circe-parser" % "0.7.0")

packageOptions += Package.ManifestAttributes("Class-Path" -> "lib/*")

enablePlugins(JavaAppPackaging)