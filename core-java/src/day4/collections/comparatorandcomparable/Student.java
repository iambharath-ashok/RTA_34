package day4.collections.comparatorandcomparable;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private Double percentage;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", percentage=" + percentage +
                '}';
    }

    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return this.getPercentage().compareTo(anotherStudent.getPercentage());
    }
}