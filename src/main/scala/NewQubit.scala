/** A qubit command that creates a new qubit with a given name. Nonterminal,
  * so it is an internal node.
  */
class NewQubit extends NonterminalExpression() {

   /** Generates a new qubit token and passes the state of the REPL to the
     * next token.
     *
     * @param ctx the state of the REPL
     * @return context the state of the REPL
     */
   def evaluate(ctx: Context): Context = {
      var context = ctx;

      // Map may have collisions, handle this
      var qubit = new Qubit();
      context.inputIndex = context.inputIndex + 1;
      context = qubit.evaluate(context);
      context.state += (context.input(context.inputIndex) -> qubit);
      context.objectName = context.input(context.inputIndex);

      // For debugging
      /*
      println("");
      for ((k,v) <- context.state) {
         println(s"key: $k, value: $v");
         println(
            "superpositionVector"
            + ": "
            + v.superpositionVector
         );
      }
      println("");
      */

      context;
   }
}
