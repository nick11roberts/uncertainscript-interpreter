import breeze.linalg._

class Context(
   var input: Array[String],
   var inputIndex: Int,
   var output: String,
   var state: scala.collection.mutable.Map[String, Qubit],
   var objectName: String
);
