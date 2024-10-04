package day4.collections.set.hashset;

import java.util.HashSet;
import java.util.Objects;

public class HashSetRemovingDuplicatesOnCustomClassExample {

    public static void main(String[] args) {

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student(1, "Bharath"));
        studentHashSet.add(new Student(2, "Bob The Builder"));
        studentHashSet.add(new Student(3, "Aegon the conquerer"));
        studentHashSet.add(new Student(4, "Maegor The Cruel"));
        studentHashSet.add(new Student(5, "Charlie"));
        studentHashSet.add(new Student(1, "Bharath"));
        studentHashSet.add(new Student(1, "Bharath"));
        studentHashSet.add(new Student(1, "Bharath"));
        studentHashSet.add(new Student(1, "Bharath The Dev"));
        studentHashSet.add(new Student(1, "Bharath The Dev"));
        studentHashSet.add(null);
        studentHashSet.add(null);

        System.out.println(studentHashSet);

    }
}

class Student {

    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name);
    }
}
