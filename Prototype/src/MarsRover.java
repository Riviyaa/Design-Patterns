public class MarsRover {
    public static void main(String [] args) {
        ImageBuffer [] mars = new ImageBuffer[5];
        BufferMaker bufmaker = new BufferMaker();
        int i=0;
        try {
            mars[i++] = bufmaker.makeImageBuffer('b');
            mars[i++] = bufmaker.makeImageBuffer('c');
            mars[i++] = bufmaker.makeImageBuffer('b');
            mars[i++] = bufmaker.makeImageBuffer('c');
            mars[i++] = bufmaker.makeImageBuffer('a');
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception!");
        } }
}
