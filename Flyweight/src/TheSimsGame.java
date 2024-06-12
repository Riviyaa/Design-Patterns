public class TheSimsGame {
    public static void main(String [] args) {
        SimFactory simfactory = new SimFactory(5);
        System.out.println("Creating Alice");
        Sim alice = simfactory.makeSim("Woman");
        System.out.println("Creating Bob");
        Sim bob = simfactory.makeSim("Man");
        System.out.println("Creating Charlie");
        Sim charlie = simfactory.makeSim("Woman");
        System.out.println("Creating Dave");
        Sim dave = simfactory.makeSim("Man");
        System.out.println("Rendering Alice");
        alice.render("Standing");
        System.out.println("Rendering Dave");
        dave.render("Sitting");
        System.out.println("Dress up Alice");
        alice.dressUp("Gown","Flower Pattern");
    }
}