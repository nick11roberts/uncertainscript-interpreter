import breeze.linalg._
import breeze.math._

/** Complex matrix representing the Pauli-Z transformation. 
  */
class PauliZGate extends SingleQubitGate(
      DenseMatrix(
         (Complex(1.0, 0.0), Complex(0.0, 0.0)),
         (Complex(0.0, 0.0), Complex(-1.0, 0.0))
      )
   ) {}
