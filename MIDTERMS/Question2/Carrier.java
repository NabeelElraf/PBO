class Carrier extends Tent {
    private int volumeLiter;
    public Carrier(String brand, double weightKg, double rentalPrice, int capacity, int volumeLiter) {
        super(brand, weightKg, rentalPrice, capacity);
        this.volumeLiter = volumeLiter;
    }
    @Override public void showMaintenance() { System.out.println("Carrier maintenance: clean the back foam with a soft brush."); }
    public int getVolumeLiter() { return volumeLiter; }
}
