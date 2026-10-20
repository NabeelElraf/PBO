public class Main {
    public static void main(String[] args) {
        BackpackingEquipment[] equipment = {
            new Tent("Mountain Tent", 2.4, 2),
            new SleepingBag("Down Sleeping Bag", 1.1, -5),
            new Backpack("Trekking Backpack", 1.6, 50)
        };
        for (BackpackingEquipment item : equipment) item.showInfo();
    }
}
