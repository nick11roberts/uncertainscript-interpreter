object Main extends App {
   var interpreter = new Interpreter();
   interpreter.interpret("hadamard hadamard qubit q");
   interpreter.interpret("qubit w");
   interpreter.interpret("hadamard w");
   interpreter.interpret("hadamard q");
   interpreter.interpret("qubit e");
}
