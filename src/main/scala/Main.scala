object Main extends App {
   var interpreter = new Interpreter();
   interpreter.interpret("hadamard hadamard qubit q");
   interpreter.interpret("qubit w");
   interpreter.interpret("hadamard paulix w");
   interpreter.interpret("pauliy paulix pauliz q");
   interpreter.interpret("qubit e");
   interpreter.interpret("pauliy e");
}
