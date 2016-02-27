import breeze.linalg._

class Interpreter(input: String) {
   var context = new Context(
      input,
      "",
      scala.collection.mutable.Map[String, DenseVector[Double]]()
   );

   var selector = new Selector();
   var expression = selector.select("asdfas", context);
}
