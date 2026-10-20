public class Backpack extends HikingEquipment {
    private final int capacityLiters;

    public Backpack(String name, double weightKg, int capacityLiters) {
        super(name, weightKg);
        if (capacityLiters <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.capacityLiters = capacityLiters;
    }

    public int getCapacityLiters() { return capacityLiters; }

    @Override
    public String getUsage() { return "Carries hiking gear in " + capacityLiters + " L"; }
}
