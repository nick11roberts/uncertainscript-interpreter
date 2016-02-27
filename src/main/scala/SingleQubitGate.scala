import breeze.linalg._

class SingleQubitGate(gate: DenseMatrix[Double]) extends NonterminalExpression() {
   val transformationMatrix = gate;
   def evaluate(ctx: Context): Context = {
      var context = ctx;

      // Perform single qubit transformation using transformationMatrix
      context.inputIndex = context.inputIndex + 1;
      var selector = new Selector();
      var expression = selector.select(context);
      context = expression.evaluate(context);

      var operand = context.state(context.objectName);

      println(gate);

      return context;
   }
}
