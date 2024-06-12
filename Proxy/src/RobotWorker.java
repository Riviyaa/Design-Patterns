// This is the Client.
// Client use the direct move() method assuming that SafeRobot
// operates in a safe manner. However, it is the proxy that
// call a sequence of methods to ensure safety.
public class RobotWorker {
    public static void main(String [] args) {
        Robot rob = new SafeRobot();
        rob.move(1.2,3.4,5.6);
    } }