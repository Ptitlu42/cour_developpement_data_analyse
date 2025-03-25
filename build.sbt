name := "tp-scala-spark"

version := "1.0"

scalaVersion := {
  if (sbtPlugin.value) scalaVersion.value
  else "2.11.12"
}
/*
resolvers ++= Seq(
	Resolver.sonatypeRepo("releases"),
	Resolver.sonatypeRepo("snapshots")
)
*/
libraryDependencies ++= Seq(
	"com.chuusai" %% "shapeless" % "2.3.2",
	"org.scalatest" % "scalatest_2.11" % "3.0.0" % "test"
)
