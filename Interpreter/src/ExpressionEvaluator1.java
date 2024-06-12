public class ExpressionEvaluator1 {
    public static void main(String [] args) {
        // These are the symbols/terminal
        Expression port1 = new TerminalExpression("HDMI");
        Expression port2 = new TerminalExpression("VGA");
        Expression adapter = new TerminalExpression("HDM2VG");
        // These are the syntax/grammar rules
        Expression isVideoOutput1 = new ORExpression(port1,port2);
        Expression isVideoOutput2 = new ANDExpression(port1,adapter);
        Expression isVideoOutput3 = new NOTExpression(adapter);
        // we will check if given ports give a video output,
        // that is - evaluation/interpretation
        System.out.println(isVideoOutput1.interpreter
                ("Will I get a video output with HDMI"));
        System.out.println(isVideoOutput1.interpreter("VGA"));
        System.out.println(isVideoOutput1.interpreter("HDM2VG"));
        System.out.println(isVideoOutput2.interpreter("HDMI,HDM2VG"));
        System.out.println(isVideoOutput2.interpreter("VGA,HDM2VG"));
        System.out.println(isVideoOutput2.interpreter("HDM2VG"));
        System.out.println(isVideoOutput3.interpreter("HDMI"));
        System.out.println(isVideoOutput3.interpreter("VGA"));
        System.out.println(isVideoOutput3.interpreter("HDM2VG"));
    }
}