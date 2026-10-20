public class Tent extends HikingEquipment {
    private final int capacity;

    public Tent(String name, double weightKg, int capacity) {
        super(name, weightKg);
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }

    @Override
    public String getUsage() { return "Shelter for " + capacity + " hiker(s)"; }
}
