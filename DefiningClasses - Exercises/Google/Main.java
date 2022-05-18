package Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Map<String, Person> people = new LinkedHashMap<>();

        Pokemon pokemon;
        Parents parents;
        Children children;

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];

            if (!people.containsKey(name)) {
                people.put(name, new Person());
            }

            String action = tokens[1];
            switch (action) {
                case "company":
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(tokens[2], tokens[3], salary);
                    people.get(name).setCompany(company);
                    break;
                case "pokemon":
                    if (people.get(name).getPokemon() == null) {
                        pokemon = new Pokemon(tokens[2], tokens[3]);
                        people.get(name).setPokemon(pokemon);
                    } else {
                        pokemon = people.get(name).getPokemon();
                        pokemon.setPokemonsMap(tokens[2], tokens[3]);
                    }
                    break;
                case "parents":
                    if (people.get(name).getParents() == null) {
                        parents = new Parents(tokens[2], tokens[3]);
                        people.get(name).setParents(parents);
                    } else {
                        parents = people.get(name).getParents();
                        parents.setParentsMap(tokens[2], tokens[3]);
                    }
                    break;
                case "children":
                    if (people.get(name).getChildren() == null) {
                        children = new Children(tokens[2], tokens[3]);
                        people.get(name).setChildren(children);
                    } else {
                        children = people.get(name).getChildren();
                        children.setChildMap(tokens[2], tokens[3]);
                    }
                    break;
                case "car":
                    Car car = new Car(tokens[2], tokens[3]);
                    people.get(name).setCar(car);
            }
            input = in.nextLine();
        }

        String pI = in.nextLine();

        System.out.println(pI);
        System.out.println("Company:");
        if (people.get(pI).getCompany() != null) {
            System.out.printf("%s %s %.2f%n", people.get(pI).getCompany().getCompanyName(),
                    people.get(pI).getCompany().getDepartment(), people.get(pI).getCompany().getSalary());
        }
        System.out.println("Car:");
        if (people.get(pI).getCar() != null) {
            System.out.printf("%s %s%n", people.get(pI).getCar().getCarModel(),
                    people.get(pI).getCar().getCarSpeed());
        }
        System.out.println("Pokemon:");
        if (people.get(pI).getPokemon() != null) {
            printMethod(people.get(pI).getPokemon().getPokemonsMap());
        }
        System.out.println("Parents:");
        if (people.get(pI).getParents() != null) {
            printMethod(people.get(pI).getParents().getParentsMap());
        }
        System.out.println("Children:");
        if (people.get(pI).getChildren() != null) {
            printMethod(people.get(pI).getChildren().getChildMap());
        }
    }

    public static void printMethod(Map<String, String> getMap) {
        getMap.forEach((key, value) -> System.out.printf("%s %s%n", key, value));
    }
}