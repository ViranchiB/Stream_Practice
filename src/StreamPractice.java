import java.util.*;

class Employee {
    int empId;
    String name;
    int age;
    String country;
    String gender;
    boolean isActive;

    public Employee(int empId, String name, int age, String country, String gender, boolean isActive) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.country = country;
        this.gender = gender;
        this.isActive = isActive;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}

public class StreamPractice {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Dani", 26, "India", "Female", true),
                new Employee(102, "Mia", 28, "Germany", "Female", false),
                new Employee(103, "Aisha", 24, "India",  "Female", true),
                new Employee(104, "John", 30, "USA", "Male", false),
                new Employee(105, "Meera", 27, "India",  "Female", true),
                new Employee(106, "Lukas", 35, "Germany",  "Female", true),
                new Employee(107, "Sara", 29, "USA",  "Female", false),
                new Employee(108, "A", 31, "India", "Male", true),
                new Employee(109, "Emily", 24, "Canada",  "Female", true),
                new Employee(110, "Carlos", 33, "Brazil", "Male", false)
        );

        // 1. Find even age emp
        List<Employee> evenAgeEmp = employees.stream().filter(emp -> emp.getAge() % 2 == 0).toList();
        System.out.println("EvenAgeEmp: " + evenAgeEmp);

        // 2. Sum age of an emp
        int totalAgeSum = employees.stream().map(Employee::getAge).mapToInt(Integer::intValue).sum();
        System.out.println("TotalAgeSum: " + totalAgeSum);

        // 3. Max age emp
        OptionalInt maxAgeEmp = employees.stream().map(Employee::getAge).mapToInt(Integer::intValue).max();
        System.out.println("maxAge: " + maxAgeEmp.getAsInt());
        
        // Sort emp by name
        List<Employee> sortByName = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        System.out.println("sortByName: " + sortByName);
    }
}


