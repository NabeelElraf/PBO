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
