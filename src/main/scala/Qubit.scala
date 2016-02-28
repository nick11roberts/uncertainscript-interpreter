import breeze.linalg._
import breeze.math._

class Qubit extends TerminalExpression() {

   var superpositionVector = DenseVector.zeros[Complex](2);

   def evaluate(context: Context): Context = {
      randomizeState();
      context;
   }

   def randomizeState() {
      val r = scala.util.Random;
      val rand = r.nextDouble();
      val randComp = 1 - rand;
      superpositionVector(0) = Complex(math.sqrt(rand), 0.0);
      superpositionVector(1) = Complex(math.sqrt(randComp), 0.0);
   }

   def readState(): Int = {
      val r = scala.util.Random;
      if(superpositionVector(0).real <= r.nextDouble()) {
         0
      } else {
         1
      }
   }
}
