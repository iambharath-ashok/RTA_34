package day4.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapWithCustomClassAsKey {

    public static void main(String[] args) {

        Map<Student, Integer> studentDatabase = new HashMap<>();

        studentDatabase.put(new Student("A", 10,97), 5);
        studentDatabase.put(new Student("B", 11,98), 2);
        studentDatabase.put(new Student("c", 9,99), 1);
        studentDatabase.put(new Student("E", 10,97.5), 3);
        studentDatabase.put(new Student("G", 11,97.3), 4);
        studentDatabase.put(new Student("G", 11,97.3), 4);
        studentDatabase.put(new Student("G", 11,97.3), 4);
        studentDatabase.put(new Student("G", 11,97.3), 4);

        System.out.println(studentDatabase);
        System.out.println(studentDatabase.size());

    }
}


class Student {

    private String name;
    private int age;
    private double percentage;

    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(percentage, student.percentage) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, percentage);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", percentage=" + percentage +
                '}';
    }
}
