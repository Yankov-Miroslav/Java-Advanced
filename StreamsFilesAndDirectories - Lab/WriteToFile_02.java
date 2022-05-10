import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Y. Miroslav\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        int value = inputStream.read();

        Set<Character> punctuations = Set.of(',', '.', '!', '?');

        while (value != -1) {
            char current = (char) value;
            if (!punctuations.contains(current)) {
                outputStream.write(current);
            }

            value = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}
