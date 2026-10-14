class Tent extends HikingEquipment {
    protected int capacity;
    public Tent(String brand, double weightKg, double rentalPrice, int capacity) {
        super(brand, weightKg, rentalPrice);
        this.capacity = capacity;
    }
    @Override public void showMaintenance() { System.out.println("Tent maintenance: dry it completely before folding."); }
}
