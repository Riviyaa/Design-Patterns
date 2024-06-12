import java.io.FileNotFoundException;
import java.io.IOException;

public class FaceRecognition {
    public static void main(String [] args) {
        Image img = new Image();
        try {
            img.load("image-data.file");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        img.show();
    }
}