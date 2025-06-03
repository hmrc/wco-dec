import sbt.*

val appName = "wco-dec"

lazy val app = Project(appName, file("."))
  .enablePlugins()
  .settings(
    majorVersion := 0,
    scalaVersion := "2.13.16",
    libraryDependencies ++= Dependencies()
  )
  .settings(scoverageSettings)

lazy val scoverageSettings: Seq[Setting[?]] = Seq(
    coverageExcludedPackages := List("<empty>").mkString(";"),
    coverageMinimumStmtTotal := 50,
    coverageFailOnMinimum := true,
    coverageHighlighting := true,
    Test / parallelExecution := false
)

addCommandAlias("ucomp", "Test/compile")
addCommandAlias("precommit", ";clean;coverage;test;coverageReport")
