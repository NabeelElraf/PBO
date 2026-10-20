public abstract class BackpackingEquipment {
    private final String name;
    private final double weightKg;

    public BackpackingEquipment(String name, double weightKg) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name is required");
        if (weightKg < 0) throw new IllegalArgumentException("Weight cannot be negative");
        this.name = name;
        this.weightKg = weightKg;
    }

    public String getName() { return name; }
    public double getWeightKg() { return weightKg; }

    public void showInfo() {
        System.out.printf("%s (%.2f kg): %s%n", name, weightKg, getUsage());
    }

    public abstract String getUsage();
}
