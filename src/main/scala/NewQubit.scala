class NewQubit() extends NonterminalExpression() {
   def evaluate(ctx: Context): Context = {
      var context = ctx;

      // Map may have collisions, handle this
      var qubit = new Qubit();
      context.inputIndex = context.inputIndex + 1;
      context = qubit.evaluate(context);
      context.state += (context.input(context.inputIndex) -> qubit);
      context.objectName = context.input(context.inputIndex);

      for ((k,v) <- context.state) {
         println(s"key: $k, value: $v");
         println(v.superpositionVector);
      }

      return context;
   }
}
