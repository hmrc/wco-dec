import sbt.*

val appName = "wco-dec"

lazy val app = Project(appName, file("."))
  .enablePlugins(SbtAutoBuildPlugin)
  .settings(
    majorVersion := 0,
    scalaVersion := "2.13.12",
    libraryDependencies ++= Dependencies(),
    isPublicArtefact := true
  )
  .settings(scoverageSettings)

lazy val scoverageSettings: Seq[Setting[?]] = Seq(
    coverageExcludedPackages := List("<empty>").mkString(";"),
    coverageMinimumStmtTotal := 50,
    coverageFailOnMinimum := true,
    coverageHighlighting := true,
    Test / parallelExecution := false
)