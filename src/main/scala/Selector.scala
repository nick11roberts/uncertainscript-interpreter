/** Used to choose the next command in the input.
  */
class Selector {

   /** Chooses commands based on the context, generates a token.
     *
     * @param context the state information of the REPL
     * @return token the token for the next piece of inut
     */
   def select(context: Context): AbstractExpression = {
      val NewQubitToken = "qubit";
      val ReadQubitToken = "read";
      val HadamardGateToken = "hadamard";
      val PauliXGateToken = "paulix";
      val PauliYGateToken = "pauliy";
      val PauliZGateToken = "pauliz";

      // Parse it to the correct AbstractExpression
      val token = context.input(context.inputIndex);
      if(token == NewQubitToken)
         new NewQubit;
      else if(token == ReadQubitToken)
         new ReadQubit;
      else if(token == HadamardGateToken)
         new HadamardGate;
      else if(token == PauliXGateToken)
         new PauliXGate;
      else if(token == PauliYGateToken)
         new PauliYGate;
      else if(token == PauliZGateToken)
         new PauliZGate;
      else
         new Qubit;
   }
}
