// Client class "CoR Machine" is calling the generic
// temperature "Controller Chain" without a specific
// reference to a particular type of Temperature
// Controller
public class CoRMachine {
    public static void main(String [] args) {
        ControllerChain cc = new ControllerChain();
        cc.control(-50);
        cc.control(50);
        cc.control(150);
    }
}