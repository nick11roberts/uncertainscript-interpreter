import breeze.linalg._
import breeze.math._

/** A quantum bit. Implementing TerminalExpression, and therefore a leaf node.
  */
class Qubit extends TerminalExpression() {

   var superpositionVector = DenseVector.zeros[Complex](2);

   /** Randomizes the qubit and returns the context to the next token.
     *
     * @param context the state of the REPL
     * @return context the state of the REPL
     */
   def evaluate(context: Context): Context = {
      randomizeState();
      context;
   }

   /** Randomizes the qubit such that (v1)^2 + (v2)^2 = 1.
     */
   def randomizeState() {
      val r = scala.util.Random;
      val rand = r.nextDouble();
      val randComp = 1 - rand;
      superpositionVector(0) = Complex(math.sqrt(rand), 0.0);
      superpositionVector(1) = Complex(math.sqrt(randComp), 0.0);
   }

   /** Reads the state of the qubit, forcing it to 0 or 1.
     *
     * @return the collapsed state, 0 or 1
     */
   def readState(): Int = {
      val r = scala.util.Random;
      if(superpositionVector(0).real <= r.nextDouble()) {
         0
      } else {
         1
      }
   }
}
