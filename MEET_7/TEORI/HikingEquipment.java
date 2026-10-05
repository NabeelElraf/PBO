package MEET_7.TEORI;

public class HikingEquipment {
    protected String brand;
    protected double weightKg;
    protected double rentalPrice;
    
    // FINAL ATTRIBUTE: The value cannot be modified later
    protected final double RENTAL_TAX = 0.11; // 11% tax

    // 1. CONSTRUCTOR OVERLOADING (Without Parameters)
    public HikingEquipment() {
        this.brand = "No Brand";
        this.weightKg = 0.0;
        this.rentalPrice = 0.0;
    }

    // 1. CONSTRUCTOR OVERLOADING (With Parameters)
    public HikingEquipment(String brand, double weightKg, double rentalPrice) {
        this.brand = brand;
        this.weightKg = weightKg;
        this.rentalPrice = rentalPrice;
    }

    // 2. METHOD OVERLOADING (Parameter: days only)
    public double calculateRent(int days) {
        return rentalPrice * days;
    }

    // 2. METHOD OVERLOADING (Parameter: days and discount)
    public double calculateRent(int days, double discount) {
        return (rentalPrice * days) - discount;
    }

    // METHOD TO BE OVERRIDDEN BY CHILD CLASSES
    public void showMaintenance() {
        System.out.println("General Maintenance: Clean the equipment from dirt after use.");
    }

    // FINAL METHOD: Cannot be overridden by any child class
    public final void rentalRules() {
        System.out.println("Strict Rule: Late return will be fined $2 per day.");
    }
}