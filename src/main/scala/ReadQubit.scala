class ReadQubit() extends NonterminalExpression() {
   def evaluate(ctx: Context): Context = {
      var context = ctx;

      // Perform single qubit transformation using transformationMatrix
      context.inputIndex = context.inputIndex + 1;
      var selector = new Selector();
      var expression = selector.select(context);
      context = expression.evaluate(context);
      context.objectName = context.input(context.inputIndex);
      var operand = context.state(context.objectName);

      context.output += operand.readState;

      context.state -= context.objectName;

      return context;
   }
}
