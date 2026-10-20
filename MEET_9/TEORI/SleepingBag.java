public class SleepingBag extends HikingEquipment {
    private final int comfortTemperatureC;

    public SleepingBag(String name, double weightKg, int comfortTemperatureC) {
        super(name, weightKg);
        this.comfortTemperatureC = comfortTemperatureC;
    }

    public int getComfortTemperatureC() { return comfortTemperatureC; }

    @Override
    public String getUsage() { return "Keeps the hiker warm down to " + comfortTemperatureC + " C"; }
}
