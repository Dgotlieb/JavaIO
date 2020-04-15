import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileTest {
    public static void main(String[] args) {
        try {
            File logFile=new File("C://...file.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
            writer.write ("Hello world");
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
