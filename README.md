#Note this may be merged into AIRServe-Extras anytime so use it only for test code

Any function that is added to the flowchart for processing needs to implement this.
This provides AIRServe and entry point to run your particular code.

###To add this as an sbt dependency

* create a project folder in your root directory if it is not already there
* Add a file called build.scala

<code>
import sbt._

object MyBuild extends Build {

  lazy val root = Project("root", file(".")) dependsOn(AIRServeModule)
  lazy val AIRServeModule =
       RootProject(uri("git://github.com/paritosh-gupta/AIRServeExtras.git"))

}
</code>


#Compilation
clone the repository
<code>sbt package</code>
