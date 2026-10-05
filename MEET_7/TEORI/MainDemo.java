package MEET_7.TEORI;

public class MainDemo {
    public static void main(String[] args) {
        // Creating objects using Constructor Overloading
        Tent tent = new Tent("Consina", 2.5, 10.0, 4);
        Carrier carrier = new Carrier("Eiger", 1.8, 5.0, 60);

        System.out.println("=== OVERLOADING TEST ===");
        // Calling Method Overloading
        System.out.println("Tent rent (3 days)           : $" + tent.calculateRent(3));
        System.out.println("Tent rent (3 days + discount): $" + tent.calculateRent(3, 2.5));

        System.out.println("\n=== OVERRIDING TEST ===");
        // Calling Overridden Methods
        tent.showMaintenance();
        carrier.showMaintenance();

        System.out.println("\n=== FINAL KEYWORD TEST ===");
        // Accessing final method from the parent class
        tent.rentalRules();
    }
}