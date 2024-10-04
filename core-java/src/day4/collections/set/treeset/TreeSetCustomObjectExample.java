package day4.collections.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomObjectExample {

    public static void main(String[] args) {

        TreeSet<Person> peoplesByName = new TreeSet<>(Comparator.comparing(Person::getName));
        TreeSet<Person> peoplesByAge = new TreeSet<>(Comparator.comparing(Person::getAge));

        peoplesByName.add(new Person("Archer", 49));
        peoplesByName.add(new Person("Bella", 29));
        peoplesByName.add(new Person("Catherine", 18));
        peoplesByName.add(new Person("David miller", 63));


        System.out.println("Peoples By Name :: "+ peoplesByName);


        peoplesByAge.add(new Person("Archer", 49));
        peoplesByAge.add(new Person("Bella", 29));
        peoplesByAge.add(new Person("Catherine", 18));
        peoplesByAge.add(new Person("David miller", 63));

        System.out.println("Peoples by Age :: "+ peoplesByAge);

        TreeSet<Person> peoplesWithDefaultComparator = new TreeSet<>();

        peoplesWithDefaultComparator.add(new Person("Archer", 49));
        peoplesWithDefaultComparator.add(new Person("Bella", 29));
        peoplesWithDefaultComparator.add(new Person("Catherine", 18));
        peoplesWithDefaultComparator.add(new Person("David miller", 63));

        System.out.println("Peoples by Custom Comparator :: "+ peoplesWithDefaultComparator);

    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", aga=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.getAge() - this.getAge() ;
    }
}
