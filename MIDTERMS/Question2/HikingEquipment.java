class HikingEquipment {
    protected String brand;
    protected double weightKg;
    protected double rentalPrice;
    protected final double RENTAL_TAX = 0.11;

    public HikingEquipment() { this("No Brand", 0.0, 0.0); }
    public HikingEquipment(String brand, double weightKg, double rentalPrice) {
        this.brand = brand;
        this.weightKg = weightKg;
        this.rentalPrice = rentalPrice;
    }
    public double calculateRent(int days) {
        if (days <= 0) throw new IllegalArgumentException("Days must be positive.");
        return rentalPrice * days;
    }
    public double calculateRent(int days, double discount) {
        if (days <= 0 || discount < 0) throw new IllegalArgumentException("Invalid rental input.");
        return Math.max(0.0, calculateRent(days) - discount);
    }
    public void showMaintenance() { System.out.println("General maintenance: clean equipment after use."); }
    public final void rentalRules() { System.out.println("Late returns are subject to a fixed rental rule."); }
}
