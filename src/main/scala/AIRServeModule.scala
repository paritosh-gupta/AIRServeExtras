import org.apache.spark.SparkContext

/*
Any module that is input in the flowchart needs to extend this.
*/
trait AIRServeModule {
  /*
  * kind of like main.This is what Air-serve will execute
  * @param sc :- SparkContext
  */
  def runTask(sc: SparkContext): Any
}

// example for extending
// object Temp extends AIRServeModule{
//     override def runTask(sc: SparkContext): Any ={
//       val a="asd"
//     }
// }
