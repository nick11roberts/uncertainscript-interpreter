import breeze.linalg._

class HadamardGate() extends SingleQubitGate(
      DenseMatrix(
         (1.0, 1.0),
         (1.0, -1.0)
      ) :*= (1.0 / math.sqrt(2.0))
   ) {}
