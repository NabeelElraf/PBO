package MEET_7.TEORI;

public class Carrier extends HikingEquipment {
    private int volumeLiter;

    public Carrier(String brand, double weightKg, double rentalPrice, int volumeLiter) {
        super(brand, weightKg, rentalPrice);
        this.volumeLiter = volumeLiter;
    }

    // 3. METHOD OVERRIDING
    @Override
    public void showMaintenance() {
        System.out.println("Carrier Maintenance: Use a soft brush on the back foam to remove sweat.");
    }
}