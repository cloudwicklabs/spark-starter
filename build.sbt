name := "spark-starter"

version := "1.0"

scalaVersion := "2.10.5"

resolvers ++= Seq(
  "typesafe-repository" at "http://repo.typesafe.com/typesafe/releases"
)

val sparkVersion = "1.2.1"

// build a uber jar if using any of the external streaming components
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" %sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion,
  // Test dependencies
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.xerial.snappy" % "snappy-java" % "1.1.1.7"
)

parallelExecution in Test := false

fork in Test := true
    