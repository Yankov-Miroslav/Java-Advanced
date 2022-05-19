package ArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = ArrayCreator
                .<Integer>create(10, 13);

        String[] strings = ArrayCreator
                .create(String.class, 3, "Java");

        for (Integer inte : integers) {
            System.out.println(inte);
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
