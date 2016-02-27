import breeze.linalg._
import breeze.math._

class HadamardGate() extends SingleQubitGate(
      DenseMatrix(
         (Complex((1.0 / math.sqrt(2.0)), 0.0),
            Complex((1.0 / math.sqrt(2.0)), 0.0)
         ),
         (Complex((1.0 / math.sqrt(2.0)), 0.0),
            Complex(-(1.0 / math.sqrt(2.0)), 0.0)
         )
      )
   ) {}
