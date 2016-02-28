import breeze.linalg._

/** The state information of the REPL session.
  *
  * @constructor create a new instance of state information
  * @param input the regex split string input
  * @param inputIndex the current location in input
  * @param output a String representing the output stream
  * @param state the names of qubits associated with qubits
  * @param objectName the name of the current qubit being operated on
  */
class Context(
   var input: Array[String],
   var inputIndex: Int,
   var output: String,
   var state: scala.collection.mutable.Map[String, Qubit],
   var objectName: String
);
