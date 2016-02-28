/** A general, abstract type of expression.
  */
abstract class AbstractExpression {

   /** Intended to evaluage based on the type of expression and context */
   def evaluate(context: Context): Context;
   
}
