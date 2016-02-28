import breeze.linalg._
import breeze.math._

/** An abstraction of a single qubit quantum gate. Nonterminal,
  * so internal node.
  *
  * @param gate a custom quantum gate in the form of a complex matrix
  */
class SingleQubitGate(gate: DenseMatrix[Complex]) extends NonterminalExpression() {
   val transformationMatrix = gate;

   /** Alters the superposition vector of the qubit by performing a linear
     * transformation on the vector. 
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

      var operand = context.state(context.objectName);

      // For debugging
      /*
      println("objectName:" + context.objectName);
      println(operand.superpositionVector);
      println(gate);
      println((operand.superpositionVector.t * gate).t.toDenseVector);
      */

      context.state(context.objectName).superpositionVector
         = (operand.superpositionVector.t * gate).t.toDenseVector;

      context;
   }
}
