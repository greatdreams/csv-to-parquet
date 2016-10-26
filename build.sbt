name := """csv-to-parquet"""

version := "1.0"

scalaVersion := "2.11.8"

val logbackVersion = "1.1.7"
val groovyVersion = "2.4.7"
libraryDependencies ++= Seq(
  // parquet library - a columnar storage
  "org.apache.parquet" % "parquet-column" % "1.8.1",
  "org.apache.parquet" % "parquet-hadoop" % "1.8.1",
  "org.apache.hadoop" % "hadoop-common" % "2.7.3",
/*
"ch.qos.logback" % "logback-core" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-classic" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-access" % s"${logbackVersion}",
  "org.codehaus.groovy" % "groovy-all" % s"${groovyVersion}",
  */
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
)
