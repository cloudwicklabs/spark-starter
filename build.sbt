name := "spark-starter"

version := "1.0"

scalaVersion := "2.10.5"

resolvers ++= Seq(
  "typesafe-repository" at "http://repo.typesafe.com/typesafe/releases"
)

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

val sparkVersion = "1.6.0"

// build a uber jar if using any of the external streaming components
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" %sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion,
  // Test dependencies
//  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.xerial.snappy" % "snappy-java" % "1.1.1.7"
 )

parallelExecution in Test := false

fork in Test := true
    