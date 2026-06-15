package Array_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeC {
    public static void main(String[] args) {
        List<Employee> employees =
                new ArrayList<>();

        employees.add(
                new Employee(103,"Raj"));

        employees.add(
                new Employee(101,"John"));

        employees.add(
                new Employee(102,"David"));

        // one way of sorting

        employees.sort((e1,e2) -> e1.id-e2.id);
        System.out.println(employees);
    }
}
