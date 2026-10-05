package MEET_7.TEORI;

// FINAL CLASS: This class cannot be extended / cannot have child classes
public final class Tent extends HikingEquipment {
    private int capacity;

    public Tent(String brand, double weightKg, double rentalPrice, int capacity) {
        super(brand, weightKg, rentalPrice);
        this.capacity = capacity;
    }

    // 3. METHOD OVERRIDING
    @Override
    public void showMaintenance() {
        System.out.println("Tent Maintenance: Dry the tent completely before folding to prevent mold.");
    }
}