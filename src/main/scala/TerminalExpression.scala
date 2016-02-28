/** A general, abstract type of expression that terminates. Leaf node.
  */
abstract class TerminalExpression() extends AbstractExpression() {

   /** Intended to evaluage based on the type of expression and context */
   def evaluate(context: Context): Context;
   
}
