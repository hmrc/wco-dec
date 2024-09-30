import sbt._

object Dependencies {

  val jacksonVersion = "2.18.0"

  val compile : Seq[ModuleID] = List(
    "jakarta.xml.bind"                 %  "jakarta.xml.bind-api"          % "4.0.2",
    "com.fasterxml.jackson.core"       %  "jackson-core"                  % jacksonVersion,
    "com.fasterxml.jackson.core"       %  "jackson-databind"              % jacksonVersion,
    "com.fasterxml.jackson.core"       %  "jackson-annotations"           % jacksonVersion,
    "com.fasterxml.jackson.dataformat" %  "jackson-dataformat-xml"        % jacksonVersion,
    "com.fasterxml.jackson.dataformat" %  "jackson-dataformat-properties" % jacksonVersion,
    "com.fasterxml.jackson.module"     %% "jackson-module-scala"          % jacksonVersion
  )

  val test: Seq[ModuleID] = List(
    "org.scalatest"        %% "scalatest"    % "3.2.19" % "test",
    "org.pegdown"          %  "pegdown"      % "1.6.0"  % "test",
    "com.vladsch.flexmark" %  "flexmark-all" % "0.64.8" % "test"
  )

  def apply(): Seq[ModuleID] =
    (compile ++ test).map(moduleId => if (moduleId.name == "flexmark-all") moduleId else moduleId.withSources)
}
