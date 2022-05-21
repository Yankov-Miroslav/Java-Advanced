package StrategyPattern;


import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> nameSet = new TreeSet<>(new NameComparator());
        TreeSet<Person> ageSet = new TreeSet<>(new AgeComparator());

        Scanner in = new Scanner(System.in);
        int lines = Integer.parseInt(in.nextLine());

        for (int i = 0; i < lines; i++) {
            String line = in.nextLine();
            String[] peopleParameters = line.split(" ");
            String name = peopleParameters[0];
            int age = Integer.parseInt(peopleParameters[1]);
            Person person = new Person(name, age);
            nameSet.add(person);
            ageSet.add(person);
        }
        for (Person person: nameSet) {
            System.out.println(person);
        }

        for (Person person: ageSet) {
            System.out.println(person);
        }
    }
}
