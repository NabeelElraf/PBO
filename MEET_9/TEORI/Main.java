public class Main {
    public static void main(String[] args) {
        HikingEquipment[] equipment = {
            new Tent("Mountain Tent", 2.4, 2),
            new SleepingBag("Down Sleeping Bag", 1.1, -5),
            new Backpack("Trekking Backpack", 1.6, 50)
        };
        for (HikingEquipment item : equipment) item.showInfo();
    }
}
