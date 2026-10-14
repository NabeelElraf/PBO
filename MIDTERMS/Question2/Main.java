abstract class Person {
    private String name;
    protected Person(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract String getRole();
}

class Employee extends Person {
    private String employeeId;
    public Employee(String name, String employeeId) { super(name); this.employeeId = employeeId; }
    public String getEmployeeId() { return employeeId; }
    @Override public String getRole() { return "Employee"; }
}

class Lecturer extends Employee {
    private String subject;
    public Lecturer(String name, String employeeId, String subject) {
        super(name, employeeId); this.subject = subject;
    }
    public String getSubject() { return subject; }
    @Override public String getRole() { return "Lecturer"; }
}

class HeadLecturer extends Lecturer {
    private String department;
    public HeadLecturer(String name, String employeeId, String subject, String department) {
        super(name, employeeId, subject); this.department = department;
    }
    public String getDepartment() { return department; }
    @Override public String getRole() { return "Head Lecturer"; }
}

public class Main {
    public static void main(String[] args) {
        HeadLecturer head = new HeadLecturer("Dr. Sari", "EMP-007", "OOP", "Informatics");
        System.out.println("Name: " + head.getName());
        System.out.println("Employee ID: " + head.getEmployeeId());
        System.out.println("Subject: " + head.getSubject());
        System.out.println("Department: " + head.getDepartment());
        System.out.println("Role: " + head.getRole());
    }
}
