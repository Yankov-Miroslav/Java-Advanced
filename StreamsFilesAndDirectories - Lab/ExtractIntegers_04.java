import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Y. Miroslav\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out-numbers.txt");

        PrintStream out = new PrintStream(outputStream);


        Scanner in = new Scanner(inputStream);

        while (in.hasNext()) {
            if (in.hasNextInt()) {
                int number = in.nextInt();
                out.println(number);
            }
            in.next();
        }


        inputStream.close();
        outputStream.close();
    }
}
