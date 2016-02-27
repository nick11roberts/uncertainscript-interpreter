import breeze.linalg._

class Interpreter {

   var context = new Context(
      "".trim.split("\\s+"),
      0,
      "",
      scala.collection.mutable.Map[String, Qubit](),
      ""
   );

   def interpret(input: String): String = {
      context.input = input.trim.split("\\s+");
      var selector = new Selector();
      var expression = selector.select(context);
      context = expression.evaluate(context);
      var out = context.output;
      resetContext;
      out;
   }

   def resetContext {
      context.inputIndex = 0;
      context.output = "";
   }
}
