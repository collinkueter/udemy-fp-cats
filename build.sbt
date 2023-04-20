ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.collinkueter"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "udemy-fp-cats"
  )

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full)

libraryDependencies += "org.typelevel" %% "cats-core" % "2.9.0"
libraryDependencies += "org.typelevel" %% "cats-laws" % "2.9.0"
libraryDependencies += "org.typelevel" %% "discipline-core" % "1.5.1"
libraryDependencies += "org.typelevel" %% "discipline-scalatest" % "2.2.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15"