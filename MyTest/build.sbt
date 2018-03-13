// The project declaration, the scala-version is important.
// The library dependencies shall be compatible with this Scala Version.
// Please note that in the Scala world version compatibility is a big problem.

lazy val root = ( project in file(".") ).
  settings(
    name := "MyTest",
    version := "0.0.0.1-SNAPSHOT-" + "git rev-parse HEAD".!!.trim,
    scalaVersion := "2.11.7"
  )

// The sequence of library dependencies.











// Scala compile options to enable certain language features.
// These are some Functional Programming features which eases coding.
scalacOptions ++= Seq( 
    "-feature", 
    "-language:implicitConversions", 
    "-language:higherKinds", 
    "-language:existentials", 
    "-language:postfixOps"
)


// Don't test while request for packaging.
test in assembly := {}

EclipseKeys.withSource := true
