abstract class NonterminalExpression() extends AbstractExpression() {
   val operand: AbstractExpression;
   def evaluate(context: Context): Context;
}
