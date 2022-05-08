import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pairs = Integer.parseInt(in.nextLine());
        Map<String, Double> studentsInformation = new TreeMap<>();
        while (pairs-- > 0) {
            String name = in.nextLine();
            double[] scores = Arrays.stream(in.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            double sum = 0;
            for (Double grade : scores) {
                sum += grade;
            }
            double averageScore = sum / scores.length;
            studentsInformation.put(name, averageScore);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.################");
        studentsInformation.forEach((k, v) -> System.out.printf("%s is graduated with %s%n", k, decimalFormat.format(v)));
    }
}
