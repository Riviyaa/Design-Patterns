public class CommandTest2 {
    public static void main (String [] args) {
        LightBulb bulb1 = new LightBulb(); // we create a light bulb
        Television tv1 = new Television(); // we create a television
        Remote remote = new Remote(); // we create a "common" remote
        // the remote is "dynamically" passed a specfic command for a
        // particular device. Thereafter, the remote operates in a
        // "generic" manner. This leads to "loose coupling".
        remote.setCommand(new LightBulbOnCommand(bulb1));
        remote.operate();
        remote.setCommand(new TelevisionOnCommand(tv1));
        remote.operate();
        remote.setCommand(new TelevisionOffCommand(tv1));
        remote.operate();
        remote.setCommand(new LightBulbOffCommand(bulb1));
        remote.operate();
    }
}