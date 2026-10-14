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
