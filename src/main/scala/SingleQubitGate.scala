import breeze.linalg._

class SingleQubitGate(gate: DenseMatrix[Double]) extends NonterminalExpression() {
   val transformationMatrix = gate;
   def evaluate(context: Context): Context = {
      // Perform single qubit transformation using transformationMatrix
      return context;
   }
}
