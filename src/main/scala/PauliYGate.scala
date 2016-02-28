import breeze.linalg._
import breeze.math._

/** Complex matrix representing the Pauli-Y transformation. 
  */
class PauliYGate extends SingleQubitGate(
      DenseMatrix(
         (Complex(0.0, 0.0), Complex(0.0, -1.0)),
         (Complex(0.0, 1.0), Complex(0.0, 0.0))
      )
   ) {}
