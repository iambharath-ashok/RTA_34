package day4.collections.comparatorandcomparable;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {
        TreeSet<Student> naturalOrder = new TreeSet<>();

        naturalOrder.add(new Student("BBB", 14, 91.9));
        naturalOrder.add(new Student("ZZZ", 11, 51.9));
        naturalOrder.add(new Student("UUU", 13, 81.9));
        naturalOrder.add(new Student("QQQ", 9, 95.9));
        naturalOrder.add(new Student("OOO", 15, 74.9));
        naturalOrder.add(new Student("DDD", 10, 85.5));

        System.out.println("Natural Order:: "+naturalOrder);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("BBB", 14, 91.9));
        studentList.add(new Student("ZZZ", 11, 51.9));
        studentList.add(new Student("UUU", 13, 81.9));
        studentList.add(new Student("QQQ", 9, 95.9));
        studentList.add(new Student("OOO", 15, 74.9));
        studentList.add(new Student("DDD", 10, 85.5));



        Collections.sort(studentList, new StudentAgeComparator());
        for( Student student : studentList) {
            System.out.print(student+ ",");
        }

        System.out.println();
        Collections.sort(studentList, new StudentNameComparator());
        for( Student student : studentList) {
            System.out.print(student+ ",");
        }

        System.out.println();
        Collections.sort(studentList, new StudentPercentageComparator());
        for( Student student : studentList) {
            System.out.print(student+ ",");
        }

    }

}

class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }
}

class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

class StudentPercentageComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getPercentage().compareTo(student1.getPercentage());
    }
}
