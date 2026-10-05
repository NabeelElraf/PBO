package MEET_7.PRAKTIKUM;

public class Segitiga {
    private int sudut;

    // Overloading 1: Method totalSudut dengan 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Overloading 2: Method totalSudut dengan 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Overloading 3: Method keliling dengan 3 parameter (int)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    // Overloading 4: Method keliling dengan 2 parameter (int), mengembalikan double
    public double keliling(int sisiA, int sisiB) {
        // Menggunakan rumus phytagoras c = akar(a^2 + b^2)
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }

    // Main method untuk menguji (agar output bisa di-screenshot untuk tugas)
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("=== TUGAS 5.1 OVERLOADING (SEGITIGA) ===");
        System.out.println("Total sudut (1 parameter)   : " + s.totalSudut(60));
        System.out.println("Total sudut (2 parameter)   : " + s.totalSudut(60, 30));
        System.out.println("Keliling (3 sisi)           : " + s.keliling(10, 15, 20));
        System.out.println("Keliling (2 sisi, pythagoras): " + s.keliling(3, 4));
    }
}