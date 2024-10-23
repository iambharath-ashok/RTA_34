package day5.java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {

    private static List<Employee> employeesList = Arrays.asList(
            new Employee(1, "Alice", Arrays.asList("HR", "IT"), 70000, 28),
            new Employee(2, "Bob",  Arrays.asList("IT", "Software"), 85000, 34),
            new Employee(3, "Charlie",  Arrays.asList("Finance"), 95000, 40),
            new Employee(4, "David",  Arrays.asList("IT", "HR", "Finance"), 120000, 45),
            new Employee(5, "Eve",  Arrays.asList("HR"), 67000, 30)
    );

    public static void main(String[] args) {


        // Find Employees By Department
        findEmployeesByDept("IT").forEach(employee -> System.out.println(employee));
        findEmployeesByDept("HR").forEach(employee -> System.out.println(employee));
        findEmployeesWorkingMultipleDepartments().stream().forEach(employee -> System.out.println(employee));
        averageSalaryOfEmployee();


        //Find highest paid employee
        Employee highestPaid = findEmployeeByOrder(0);
        System.out.println("Highest Paid Employee::"+ highestPaid);

        Employee secondHighestPaid = findEmployeeByOrder(1);
        System.out.println("Second highest Employee:: "+ secondHighestPaid);

        findEmployeesByDept("HR").stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct().skip(1);

        System.out.println("Employees By Diff Departments");
//        employeesByDepartment("Finance").stream().forEach(employee -> System.out.println(employee));
//        employeesByDepartment("HR").stream().forEach(employee -> System.out.println(employee));




    }

    public static List<Employee> findEmployeesByDept(String deptName) {

        Stream<AbstractMap.SimpleEntry<String, Employee>> simpleEntryStream = employeesList.stream()
                .flatMap(employee -> employee.getDepartment().stream()
                        .map(departmentName -> new AbstractMap.SimpleEntry<>(departmentName, employee)));
        Map<String, List<Employee>> employeeListByDeptMap = simpleEntryStream.collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        return employeeListByDeptMap.get(deptName);
    }


//    public static List<Employee> employeesByDepartment(String departmentName) {
//        System.out.println("Employees under ::"+ departmentName);
//        Map<String, List<Employee>> employeesByDept = employeesList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
//        return employeesByDept.get(departmentName);
//    }


    public static double averageSalaryOfEmployee() {
       double averageSalary =  employeesList.stream().mapToDouble(employee -> employee.getSalary()).average().orElse(0.0);
        System.out.println("Average salary:: "+ averageSalary);
       return averageSalary;
    }

    public static Employee findEmployeeByOrder(long order) {
       Employee employee =  employeesList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .distinct()
                .skip(order)
                .findAny()
                .orElse(null);
       return employee;
    }

    public static List<Employee> findEmployeesWorkingMultipleDepartments() {
       return employeesList.stream().filter(employee -> employee.getDepartment().size() > 1)
                .collect(Collectors.toList());
    }


}


class Employee{
    private int id;
    private String name;
    private List<String> department;
    private double salary;
    private int age;

    public Employee(int id, String name, List<String> department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartment() {
        return department;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}