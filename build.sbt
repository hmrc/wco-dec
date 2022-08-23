import sbt._

val nameApp = "wco-dec"

lazy val simpleReactiveMongo = Project(nameApp, file("."))
  .enablePlugins(SbtAutoBuildPlugin)
  .settings(
    scalaVersion        := "2.13.8",
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    crossScalaVersions  := Seq("2.11.12", "2.12.6", "2.13.8"),
    majorVersion := 0,
    isPublicArtefact := true
  )
  .settings(scoverageSettings)

lazy val scoverageSettings: Seq[Setting[_]] = Seq(
    coverageExcludedPackages := List("<empty>").mkString(";"),
    coverageMinimumStmtTotal := 50,
    coverageFailOnMinimum := true,
    coverageHighlighting := true,
    Test / parallelExecution := false
)