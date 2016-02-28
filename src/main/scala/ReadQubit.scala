/** A read command on a qubit. Forces the qubit to 0 or 1. Nonterminal, so
  * it is an internal node.
  */
class ReadQubit extends NonterminalExpression() {

   /** Reads the state of the qubit, forcing it to 0 or 1, and returns
     * the state of the REPL.
     *
     * @param ctx the state of the REPL
     * @return context the state of the REPL
     */
   def evaluate(ctx: Context): Context = {
      var context = ctx;

      // Perform single qubit transformation using transformationMatrix
      context.inputIndex = context.inputIndex + 1;
      var selector = new Selector();
      var expression = selector.select(context);
      context = expression.evaluate(context);
      context.objectName = context.input(context.inputIndex);
      var operand = context.state(context.objectName);

      context.output += operand.readState;

      context.state -= context.objectName;

      context;
   }
}
