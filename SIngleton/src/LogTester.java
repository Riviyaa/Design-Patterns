public class LogTester {
    public static void main(String [] args) {
        // we define a set of Logger object references
        Logger [] log = new Logger[5];
        for(int i=0; i<5; i++) {
            // a new Logger object is assigned to each reference
            log[i] = Logger.getInstance();
            log[i].incCount();
            // although we increase the logCount individually for
            // each object it can be seen that only a single
            // instance of the Logger object exists.
            System.out.println("Log Count is "+log[i].getCount());
        } }
}