name := "barneshut-simulation"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")


// grading libraries
libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "3.0.3" % "test",
  "junit" % "junit" % "4.10" % "test",
  "com.storm-enroute" %% "scalameter-core" % "0.6",
  "com.github.scala-blitz" %% "scala-blitz" % "1.1",
  "org.scala-lang.modules" %% "scala-swing" % "1.0.1",
  "com.storm-enroute" %% "scalameter" % "0.6" % "test",
  "org.apache.spark" %% "spark-core" % "1.2.1"
)

