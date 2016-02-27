import breeze.linalg._
import breeze.math._

class PauliZGate() extends SingleQubitGate(
      DenseMatrix(
         (Complex(1.0, 0.0), Complex(0.0, 0.0)),
         (Complex(0.0, 0.0), Complex(-1.0, 0.0))
      )
   ) {}
