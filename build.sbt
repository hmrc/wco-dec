import sbt._

val nameApp = "wco-dec"

lazy val simpleReactiveMongo = Project(nameApp, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    scalaVersion        := "2.11.12",
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    resolvers           += Resolver.jcenterRepo,
    crossScalaVersions  := Seq("2.11.12", "2.12.6"),
    makePublicallyAvailableOnBintray := true,
    majorVersion := 0
).settings(scoverageSettings)

lazy val scoverageSettings: Seq[Setting[_]] = Seq(
    coverageExcludedPackages := List("<empty>").mkString(";"),
    coverageMinimum := 50,
    coverageFailOnMinimum := true,
    coverageHighlighting := true,
    parallelExecution in Test := false
)