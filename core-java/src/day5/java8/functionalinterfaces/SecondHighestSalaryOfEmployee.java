package day5.java8.functionalinterfaces;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestSalaryOfEmployee {


    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee("Alice", "Software", 60000),
                new Employee("Bob", "Hardware", 55000),
                new Employee("Charlie", "IT", 60000),
                new Employee("David", "Software", 45000),
                new Employee("Eve", "HR", 75000),
                new Employee("Frank", "Hardware", 50000),
                new Employee("Grace", "IT", 70000)
        );

//        Optional<Employee> secondHighestEmployee = employeesList
//                                                            .stream()
//                                                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                                                                .distinct()
//                                                                .skip(2)
//                                                            .findFirst();

        Stream<Employee> skip = employeesList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .distinct()
                .skip(2);

        System.out.println(skip);
//        Map<String, List<Employee>> employeesByDept = employeesList.stream().collect(Collectors.groupingBy(Employee::getJob));
//        Map<String, Long> employeesCountByDept = employeesList.stream().collect(Collectors.groupingBy(Employee::getJob, Collectors.counting()));
//
//        System.out.println(secondHighestEmployee.get());

//        System.out.println(employeesByDept);
//        System.out.println(employeesCountByDept);


    }
}
