package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("END")) {

            String[] peopleParameters = input.split(" ");
            String name = peopleParameters[0];
            int age = Integer.parseInt(peopleParameters[1]);
            String town = peopleParameters[2];
            Person person = new Person(name, age, town);
            people.add(person);
            input = in.nextLine();
        }
        int comparePerson = Integer.parseInt(in.nextLine());
        Person personToCompare = people.get(comparePerson - 1);
        people.remove(comparePerson - 1);

        int samePerson = 0;
        int differentPeople = 0;

        for (Person person : people) {
            if (person.compareTo(personToCompare) == 0) {
                samePerson++;
            } else {
                differentPeople++;
            }
        }
        if (samePerson > 0) {
            int totalPeople = people.size() + 1;
            System.out.printf("%d %d %d", ++samePerson, differentPeople, totalPeople);
        } else {
            System.out.println("No matches");
        }
    }
}
