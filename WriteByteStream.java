import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class WriteByteStream {
    public static void main(String args[]) {
        
        // Writing to file
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");
            String data = "Hey this is Mohit";
            byte[] byteArray = data.getBytes();
            fos.write(byteArray);
            fos.close();
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        // Reading from file
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            int i;
            while ((i = fis.read()) != -1) { // read() returns -1 at end of file
                System.out.print((char) i);  // convert byte to char for display
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
