import breeze.linalg._

abstract class SingleQubitGate() extends NonterminalExpression() {
   val transformationMatrix: DenseMatrix[Double];
   val operand: AbstractExpression;
   def evaluate(context: Context): Context = {
      return context;
   }
}
