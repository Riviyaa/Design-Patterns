
// This interface ensures that every expression has its
// own interpreter
interface Expression {
    public boolean interpreter(String context);
}
// This is a leaf-level expression that evaluate values
// and in this instance returns a boolean value
class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data) { this.data = data; }
    public boolean interpreter(String context) {
        if(context.contains(data))
            return true;
        else
            return false;
    }
}
// This is a composite expression that evaluate other
// expressions and specifically OR condition
class ORExpression implements Expression {
    private Expression left, right;
    public ORExpression(Expression left, Expression right) {
        this.left = left; this.right = right;
    }
    public boolean interpreter(String context) {
        return
                left.interpreter(context) || right.interpreter(context);
    }
}
// This is a composite expression that evaluate other
// expressions and specifically AND condition
class ANDExpression implements Expression {
    private Expression left, right;
    public ANDExpression(Expression left, Expression right) {
        this.left = left; this.right = right;
    }
    public boolean interpreter(String context) {
        return
                left.interpreter(context) && right.interpreter(context);
    }
}

// This is a composite expression that evaluate another
// expression and specifically NOT condition
class NOTExpression implements Expression {
    private Expression exp;
    public NOTExpression(Expression exp) {
        this.exp = exp;
    }
    public boolean interpreter(String context) {
        return !exp.interpreter(context);
    }
}
