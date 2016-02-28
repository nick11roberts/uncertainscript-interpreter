import breeze.linalg._
import breeze.math._

/** Complex matrix representing the hadamard transformation.
  */
class HadamardGate extends SingleQubitGate(
      DenseMatrix(
         (Complex((1.0 / math.sqrt(2.0)), 0.0),
            Complex((1.0 / math.sqrt(2.0)), 0.0)
         ),
         (Complex((1.0 / math.sqrt(2.0)), 0.0),
            Complex(-(1.0 / math.sqrt(2.0)), 0.0)
         )
      )
   ) {}
