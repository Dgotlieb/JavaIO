import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
