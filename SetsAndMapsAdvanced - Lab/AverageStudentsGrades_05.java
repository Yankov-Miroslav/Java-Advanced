import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        List<Double> grades;
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!students.containsKey(name)) {
                grades = new ArrayList<>();
                grades.add(grade);
                students.put(name, grades);
            } else {
                students.get(name).add(grade);
            }

        }
        students.forEach((key, value) -> {
            System.out.print(key + " -> ");
            value.forEach((values) -> System.out.printf("%.2f ", values));
            System.out.printf("(avg: %.2f)%n", average(value));
        });

    }

    private static Double average(List<Double> grades) {
        double avg = 0;
        for (Double grade : grades) {
            avg += grade;
        }
        avg = avg / grades.size();
        return avg;
    }
}
