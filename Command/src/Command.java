interface Command {
    public void execute();
}
class LightBulb {
    public void on() { System.out.println("Light is on"); }
    public void off() { System.out.println("Light is off"); }
}
class LightBulbOnCommand implements Command {
    private LightBulb lightb;
    public LightBulbOnCommand(LightBulb lightb) {
        this.lightb = lightb;
    }
    public void execute() { lightb.on(); }
}
class LightBulbOffCommand implements Command {
    private LightBulb lightb;
    public LightBulbOffCommand(LightBulb lightb) {
        this.lightb = lightb;
    }
    public void execute() { lightb.off(); }
}
class Television {
    public void on() { System.out.println("Television is on"); }
    public void off() { System.out.println("Television is off"); }
    public int getStoredPreferences(String param) {
        System.out.println("retrieving parameters for "+param);
        return 1; }
    public void setChannel(int channel) { }
    public void setVolume(int volume) { }
}
class TelevisionOnCommand implements Command {
    private Television tv;
    public TelevisionOnCommand(Television tv) { this.tv = tv; }
    public void execute() {
        int channel = tv.getStoredPreferences("channel");
        int volume = tv.getStoredPreferences("volume");
        tv.setChannel(channel);
        tv.setVolume(volume);
        tv.on(); }
}
class TelevisionOffCommand implements Command {
    private Television tv;
    public TelevisionOffCommand(Television tv) { this.tv = tv; }
    public void execute() { tv.off(); }
}
class Remote {
    private Command cmd;
    public void setCommand(Command cmd) { this.cmd = cmd; }
    public void operate() { cmd.execute(); }
}
