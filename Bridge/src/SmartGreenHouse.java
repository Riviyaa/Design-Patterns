// This is the Smart Green House application
public class SmartGreenHouse {
    public static void main(String [] args) {
        AgroBot bot1 = new WaterBot(new MoistureSensor(),
                new SolenoidValveActuator());
        bot1.doWork();
        AgroBot bot2 = new FertilizerBot(new NitrogenSensor(),
                new MotorizedDoorActuator());
        bot2.doWork();
    }
}