import breeze.linalg._
import breeze.math._

/** Complex matrix representing the Pauli-X transformation. 
  */
class PauliXGate extends SingleQubitGate(
      DenseMatrix(
         (Complex(0.0, 0.0), Complex(1.0, 0.0)),
         (Complex(1.0, 0.0), Complex(0.0, 0.0))
      )
   ) {}
