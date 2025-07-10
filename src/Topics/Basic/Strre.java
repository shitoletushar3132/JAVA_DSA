import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class Strre {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 75000),
                new Employee(2, "Bob", 65000),
                new Employee(3, "Ankit", 85000),
                new Employee(4, "David", 55000),
                new Employee(5, "Aman", 72000)
        );

        // 1. Names starting with 'A'
        List<String> namesStartingWithA = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with A: " + namesStartingWithA);

        // 2. Highest salaried employee
        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestPaid.ifPresent(emp -> System.out.println("Highest Paid: " + emp));

        // 3. ID to Salary map
        Map<Integer, Double> idToSalaryMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        System.out.println("ID to Salary Map: " + idToSalaryMap);
    }
}
