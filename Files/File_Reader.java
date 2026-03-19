import java.io.FileReader;
import java.io.IOException;

public class File_Reader{
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("example.txt");
        int i;
        while((i = fr.read()) != -1){
            System.out.println((char) i);
        }
        fr.close();
        }catch(IOException e){
            System.out.println("Error Occured" + e.getMessage());
        }

    }
}