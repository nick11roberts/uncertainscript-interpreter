import breeze.linalg._

class Qubit() extends TerminalExpression() {

   var superpositionVector = DenseVector[Double](2);

   def evaluate(context: Context): Context = {
      return context;
   }

   def randomizeState() {
      val r = scala.util.Random;
      val rand = r.nextDouble();
      val randComp = 1 - rand;
      superpositionVector(0) = math.sqrt(rand);
      superpositionVector(1) = math.sqrt(randComp);
   }
}
