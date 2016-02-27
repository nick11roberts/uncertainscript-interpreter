class Selector() {
   def select(context: Context): AbstractExpression = {
      val NewQubitToken = "qubit";
      val HadamardGateToken = "hadamard";

      // Parse it to the correct AbstractExpression
      val token = context.input(context.inputIndex);
      if(token == NewQubitToken)
         new NewQubit();
      else if(token == HadamardGateToken)
         new HadamardGate();
      else
         new Qubit();
   }
}
