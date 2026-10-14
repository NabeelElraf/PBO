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
