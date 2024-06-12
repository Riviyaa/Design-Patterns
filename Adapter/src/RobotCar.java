public class RobotCar {
    public static void main(String [] args) {
        DistanceSensor ds = new PIRDistanceSensor();
        System.out.println("Obstacle at "+ds.getDistance()+" cm");
    }
}