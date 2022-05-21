package StrategyPattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPeron) {
        return Integer.compare(firstPerson.getAge(), secondPeron.getAge());
    }
}
