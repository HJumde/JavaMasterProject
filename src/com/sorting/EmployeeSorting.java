package com.sorting;

import com.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSorting {

    //find the highest salary Employee from each Dept
    public void sortEmployee() {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "A", 10000));
        list.add(new Employee(2, "A", 20000));
        list.add(new Employee(3, "A", 15000));
        list.add(new Employee(10, "A", 17000));

        list.add(new Employee(4, "B", 30000));
        list.add(new Employee(5, "B", 50000));
        list.add(new Employee(6, "B", 40000));
        list.add(new Employee(11, "B", 37000));

        list.add(new Employee(7, "C", 70000));
        list.add(new Employee(8, "C", 90000));
        list.add(new Employee(9, "C", 80000));
        list.add(new Employee(12, "C", 77000));

        Map<String, ArrayList<Employee>> ml = new HashMap<String, ArrayList<Employee>>();
        for (Employee emp : list) {
            ArrayList<Employee> lemp;
            if (ml.containsKey(emp.getDept())) {
                lemp = ml.get(emp.getDept());
            } else {
                lemp = new ArrayList<Employee>();
            }
            lemp.add(emp);

            Collections.sort(lemp, new Comparator<Employee>() {
                public int compare(Employee e1, Employee e2) {
                    return -(e1.getSalary() - e2.getSalary());
                }
            });
            ml.put(emp.getDept(), lemp);
        }

        Set<Map.Entry<String, ArrayList<Employee>>> set = ml.entrySet();
        for (Map.Entry<String, ArrayList<Employee>> s1 : set) {
            List<Employee> elist = s1.getValue();
            for (Employee e1 : elist) {
                System.out.println();
                System.out.println(e1.getId() + ":" + e1.getDept() + ":" + e1.getSalary());
                break;
            }
        }

    }

    //https://www.onlinetutorialspoint.com/java8/java-8-groupingby-example.html

    public void sortEmployeeUsingJava8() {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "A", 10000));
        employeeList.add(new Employee(2, "A", 20000));
        employeeList.add(new Employee(3, "A", 15000));
        employeeList.add(new Employee(10, "A", 17000));

        employeeList.add(new Employee(4, "B", 30000));
        employeeList.add(new Employee(5, "B", 50000));
        employeeList.add(new Employee(6, "B", 40000));
        employeeList.add(new Employee(11, "B", 37000));

        employeeList.add(new Employee(7, "C", 70000));
        employeeList.add(new Employee(8, "C", 90000));
        employeeList.add(new Employee(9, "C", 80000));
        employeeList.add(new Employee(12, "C", 77000));

        Map<String, List<Employee>> byDept = employeeList.stream().collect(
                Collectors.groupingBy(x -> x.getDept()));

        Set<Map.Entry<String, List<Employee>>> set = byDept.entrySet().stream().map(m1 -> {
                    m1.setValue(m1.getValue().stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList()));
                    return m1;
                }
        ).collect(Collectors.toSet());


        for (Map.Entry<String, List<Employee>> s1 : set) {
            List<Employee> elist = s1.getValue();
            for (Employee e1 : elist) {

                System.out.println();
                System.out.println(e1.getId() + ":" + e1.getDept() + ":" + e1.getSalary());
                break;
            }
        }

    }

    //find the second highest salary employee from list of employee object using java 8

    public void readSecondHighestSalary() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "A", 10000));
        employeeList.add(new Employee(2, "A", 20000));
        employeeList.add(new Employee(3, "A", 15000));
        employeeList.add(new Employee(10, "A", 17000));

        employeeList.add(new Employee(4, "B", 30000));
        employeeList.add(new Employee(5, "B", 50000));
        employeeList.add(new Employee(6, "B", 40000));
        employeeList.add(new Employee(11, "B", 37000));

        employeeList.add(new Employee(7, "C", 70000));
        employeeList.add(new Employee(8, "C", 90000));
        employeeList.add(new Employee(9, "C", 80000));
        employeeList.add(new Employee(12, "C", 77000));

        Optional<Employee> emp = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(emp.get().getSalary());

        // Find the Third Highest Salry of Employee
        Optional<Employee> emp1 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println(emp1.get().getSalary());
        System.out.println("--------------------------salary of Employee I Sorted Order as given below-------------------------------------------------------");
        employeeList.stream().map(x -> x.getSalary()).sorted(Collections.reverseOrder()).forEach(System.out::println);
    }


}
