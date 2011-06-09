name := "streamyj"

version := "0.2.2-SNAPSHOT"

organization := "com.twitter"

scalaVersion := "2.9.0"

libraryDependencies ++= Seq("org.codehaus.jackson" % "jackson-core-asl" % "1.5.2",
                            "org.objenesis" % "objenesis" % "1.1",
                            "org.scala-tools.testing" %% "specs" % "1.6.5" % "test")
