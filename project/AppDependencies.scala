import sbt._

object AppDependencies {

  val jacksonVersion = "2.11.3" // Pinned at 2.11.3 due to open issue https://github.com/FasterXML/jackson-dataformat-xml/issues/491

  val compile = Seq(
    "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
    "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
    "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion,
    "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % jacksonVersion,
    "com.fasterxml.jackson.dataformat" % "jackson-dataformat-properties" % jacksonVersion,
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion
  )

  val test = Seq(
    "org.scalatest" %% "scalatest" % "3.2.12" % "test",
    "org.pegdown" % "pegdown" % "1.6.0" % "test",
    "com.vladsch.flexmark"   % "flexmark-all"        % "0.62.2"            % "test"
  )

}
