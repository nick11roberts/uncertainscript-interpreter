import breeze.linalg._

/** A tool for interpreting uncertaintyscript code.
  */
class Interpreter {

   /** State-saving context of the interpreter. 
     */
   var context = new Context(
      "".trim.split("\\s+"),
      0,
      "",
      scala.collection.mutable.Map[String, Qubit](),
      ""
   );

   /** Interprets a single line of uncertaintyscript code.
     *
     * @param input the line of uncertaintyscript
     * @return the output of the interpretation
     */
   def interpret(input: String): String = {
      context.input = input.trim.split("\\s+");
      var selector = new Selector();
      var expression = selector.select(context);
      context = expression.evaluate(context);
      var out = context.output;
      resetContext;
      out;
   }

   /** Refreshes the context variable for the next line of input.
     */
   def resetContext {
      context.inputIndex = 0;
      context.output = "";
   }
}
