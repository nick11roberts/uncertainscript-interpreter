import breeze.linalg._

class Interpreter(input: String) {
   var context = new Context(
      input,
      "",
      scala.collection.mutable.Map[String, DenseMatrix[Double]]()
   );
}
