ThisBuild / scalaVersion     := "2.12.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.workday.warp"
ThisBuild / organizationName := "warp"

lazy val root = (project in file("."))
  .settings(
    name := "warp-core-starter-kit",
    libraryDependencies ++= Seq(
      "com.workday.warp" %% "warp-core" % "5.0.1" % Test,
      "org.junit.jupiter" % "junit-jupiter-engine" % "5.7.0" % Test,
      "net.aichler" % "jupiter-interface" % "0.9.0" % Test
    )
  )
