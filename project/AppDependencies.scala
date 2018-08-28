import sbt._

object AppDependencies {

  val jacksonVersion = "2.9.6"

  val compile = Seq(
    "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
    "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
    "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion,
    "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % jacksonVersion,
    "com.fasterxml.jackson.dataformat" % "jackson-dataformat-properties" % jacksonVersion,
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion
  )

  val test = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % Test,
    "org.pegdown"   % "pegdown"    % "1.5.0" % Test
  )

}
