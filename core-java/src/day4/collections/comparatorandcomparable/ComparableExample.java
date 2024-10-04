package day4.collections.comparatorandcomparable;

import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.add(new Student("BBB", 14, 91.9));
        studentTreeSet.add(new Student("ZZZ", 11, 51.9));
        studentTreeSet.add(new Student("UUU", 13, 81.9));
        studentTreeSet.add(new Student("QQQ", 9, 95.9));
        studentTreeSet.add(new Student("OOO", 15, 74.9));
        studentTreeSet.add(new Student("DDD", 10, 85.5));

        System.out.println(studentTreeSet);

       Student ooo =  new Student("OOO", 15, 74.9);
       Student bbb =  new Student("BBB", 14, 91.9);



    }
}



