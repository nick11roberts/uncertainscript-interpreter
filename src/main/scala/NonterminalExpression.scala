/** A general, abstract type of expression that does not terminate. Internal node.
  */
abstract class NonterminalExpression() extends AbstractExpression() {

   /** Intended to evaluage based on the type of expression and context */
   def evaluate(context: Context): Context;
   
}
