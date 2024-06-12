// Example binary tree with 3 levels and 4 leaf nodes
public class PlantStatusMonitor {
    public static void main(String [] args) {
        Plant p1 = new LeafPlant("P1");
        Plant p2 = new LeafPlant("P2");
        Plant p3 = new LeafPlant("P3");
        Plant p4 = new LeafPlant("P4");
        Plant p5 = new CompositePlant("P5",2);
        p5.install(p1);
        p5.install(p2);
        Plant p6 = new CompositePlant("P6",2);
        p6.install(p3);
        p6.install(p4);
        Plant p7 = new CompositePlant("P7",2);
        p7.install(p5);
        p7.install(p6);
        p7.report();
    }
}