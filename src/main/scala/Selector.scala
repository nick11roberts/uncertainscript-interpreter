class Selector() {
   def select(context: Context): AbstractExpression = {
      val NewQubitToken = "qubit";
      val HadamardGateToken = "hadamard";
      val PauliXGateToken = "paulix";
      val PauliYGateToken = "pauliy";
      val PauliZGateToken = "pauliz";

      // Parse it to the correct AbstractExpression
      val token = context.input(context.inputIndex);
      if(token == NewQubitToken)
         new NewQubit();
      else if(token == HadamardGateToken)
         new HadamardGate();
      else if(token == PauliXGateToken)
         new PauliXGate();
      else if(token == PauliYGateToken)
         new PauliYGate();
      else if(token == PauliZGateToken)
         new PauliZGate();
      else
         new Qubit();
   }
}
