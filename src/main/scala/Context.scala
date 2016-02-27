import breeze.linalg._

class Context(
   var intput: String,
   var output: String,
   var state: scala.collection.mutable.Map[String, DenseVector[Double]]
);
