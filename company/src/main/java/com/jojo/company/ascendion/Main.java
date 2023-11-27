package com.jojo.company.ascendion;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(11, "Emp 1", 1000);
        Employee e2 = new Employee(12, "Emp 2", 3000);
        Employee e3 = new Employee(14, "Emp 3", 34234);

        List<Employee> employeeList = List.of(e1, e2, e3);

        Employee maxSalaryEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(maxSalaryEmployee);

        System.out.println("Average Salary: " + employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average().getAsDouble());

        employeeList.stream()
                .collect(Collectors.toMap(Employee::getName, emp -> emp))
                .entrySet()
                .forEach( emp -> System.out.println("Key: " + emp.getKey() +", Value: " + emp.getValue()));
    }
}
