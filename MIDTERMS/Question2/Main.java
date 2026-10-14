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

class Tent extends HikingEquipment {
    protected int capacity;
    public Tent(String brand, double weightKg, double rentalPrice, int capacity) {
        super(brand, weightKg, rentalPrice);
        this.capacity = capacity;
    }
    @Override public void showMaintenance() { System.out.println("Tent maintenance: dry it completely before folding."); }
}

class Carrier extends Tent {
    private int volumeLiter;
    public Carrier(String brand, double weightKg, double rentalPrice, int capacity, int volumeLiter) {
        super(brand, weightKg, rentalPrice, capacity);
        this.volumeLiter = volumeLiter;
    }
    @Override public void showMaintenance() { System.out.println("Carrier maintenance: clean the back foam with a soft brush."); }
    public int getVolumeLiter() { return volumeLiter; }
}

public class Main {
    public static void main(String[] args) {
        Carrier carrier = new Carrier("Eiger", 1.8, 5.0, 2, 60);
        System.out.println("Brand: " + carrier.brand);
        System.out.println("Carrier volume: " + carrier.getVolumeLiter() + " L");
        System.out.println("Rent for 3 days: $" + carrier.calculateRent(3));
        System.out.println("Rent for 3 days with discount: $" + carrier.calculateRent(3, 2.5));
        carrier.showMaintenance();
        carrier.rentalRules();
    }
}
