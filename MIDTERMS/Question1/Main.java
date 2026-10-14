abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    protected Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public abstract double purchaseParkingPass(int months);

    public double purchaseParkingPass(int months, double discountRate) {
        if (months <= 0 || discountRate < 0 || discountRate > 1) {
            throw new IllegalArgumentException("Invalid months or discount rate.");
        }
        return months * 50.0 * (1.0 - discountRate);
    }

    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmailAddress() { return emailAddress; }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        return notBlank(street) && notBlank(city) && notBlank(state)
                && notBlank(postalCode) && notBlank(country);
    }

    private boolean notBlank(String value) { return value != null && !value.trim().isEmpty(); }

    public String outputAsLabel() {
        if (!validate()) throw new IllegalStateException("Address is incomplete.");
        return street + "\n" + city + ", " + state + " " + postalCode + "\n" + country;
    }
}

class Student extends Person {
    private String studentNumber;
    private double averageMark;
    private int seminarsTaken;

    public Student(String name, String phone, String email, String studentNumber,
                   double averageMark, int seminarsTaken) {
        super(name, phone, email);
        if (averageMark < 0 || averageMark > 100 || seminarsTaken < 0)
            throw new IllegalArgumentException("Invalid student data.");
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.seminarsTaken = seminarsTaken;
    }

    @Override public double purchaseParkingPass(int months) {
        if (months <= 0) throw new IllegalArgumentException("Months must be positive.");
        return months * 30.0;
    }

    public boolean isEligibleToEnroll() { return averageMark >= 50.0; }
    public int getSeminarsTaken() { return seminarsTaken; }
    public String getStudentNumber() { return studentNumber; }
}

class Professor extends Person {
    private double salary;

    public Professor(String name, String phone, String email, double salary) {
        super(name, phone, email);
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative.");
        this.salary = salary;
    }

    @Override public double purchaseParkingPass(int months) {
        if (months <= 0) throw new IllegalArgumentException("Months must be positive.");
        return months * 20.0;
    }

    public double getSalary() { return salary; }
}

public class Main {
    public static void main(String[] args) {
        Person student = new Student("Alya", "08123456789", "alya@example.edu", "S001", 85, 4);
        Person professor = new Professor("Dr. Bima", "08111111111", "bima@example.edu", 12000000);
        System.out.printf("Student pass (2 months): %.2f%n", student.purchaseParkingPass(2));
        System.out.printf("Student discounted pass (2 months, 10%%): %.2f%n",
                student.purchaseParkingPass(2, 0.10));
        System.out.printf("Professor pass (2 months): %.2f%n", professor.purchaseParkingPass(2));
        Address address = new Address("12 Merdeka St.", "Bandung", "West Java", "40115", "Indonesia");
        System.out.println("Address valid: " + address.validate());
        System.out.println(address.outputAsLabel());
    }
}
