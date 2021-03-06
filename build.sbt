name := "sangria-relay-playground"
description := "An example of GraphQL server supporting relay written with Play and sangria."

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  filters,
  "org.sangria-graphql" %% "sangria" % "0.5.1",
  "org.sangria-graphql" %% "sangria-relay" % "0.5.1",
  "org.sangria-graphql" %% "sangria-play-json" % "0.1.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
