// This test code shows that the correct sensor is
// installed in the specific controller. This decision on
// which sensor to use is deferred to a subclass and
// can be decided at runtime.
// The ABSController class developer can work
// independently.
public class BenzABSController {
    public static void main(String [] args) {
        CarABSController carabsc = new CarABSController();
        carabsc.install();
        TruckABSController truckabsc = new TruckABSController();
        truckabsc.install();
    }
}