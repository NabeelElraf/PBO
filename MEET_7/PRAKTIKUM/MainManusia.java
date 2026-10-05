package MEET_7.PRAKTIKUM;

// Superclass
class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernafas menghirup oksigen.");
    }
    
    public void makan() {
        System.out.println("Manusia butuh makan untuk mendapatkan energi.");
    }
}

// Subclass 1
class Dosen extends Manusia {
    // Melakukan Overriding pada method makan()
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin kampus saat jam istirahat.");
    }
    
    public void lembur() {
        System.out.println("Dosen lembur untuk memeriksa tugas atau mengoreksi ujian.");
    }
}

// Subclass 2
class Mahasiswa extends Manusia {
    // Melakukan Overriding pada method makan()
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan mie instan di kos.");
    }
    
    public void tidur() {
        System.out.println("Mahasiswa tidur larut malam setelah mengerjakan tugas.");
    }
}

// Main class untuk menguji
public class MainManusia {
    public static void main(String[] args) {
        System.out.println("=== TUGAS 5.2 OVERRIDING (DYNAMIC METHOD DISPATCH) ===");
        
        // Menerapkan Dynamic Method Dispatch
        Manusia manusiaUmum = new Manusia();
        Manusia pakDosen = new Dosen();
        Manusia siMahasiswa = new Mahasiswa();

        System.out.println("\n-- Memanggil method bernafas() --");
        manusiaUmum.bernafas();
        pakDosen.bernafas();
        siMahasiswa.bernafas();

        System.out.println("\n-- Memanggil method makan() (Telah di-Override) --");
        // Setiap objek akan memanggil method makan() sesuai dengan perilakunya masing-masing
        manusiaUmum.makan();
        pakDosen.makan();
        siMahasiswa.makan();
    }
}