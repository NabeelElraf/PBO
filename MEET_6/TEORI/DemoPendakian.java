// Kelas Induk 
class AlatPendakian {
    private String merk;
    private double beratKg;
    private double hargaSewa;

    // Konstruktor
    public AlatPendakian(String merk, double beratKg, double hargaSewa) {
        this.merk = merk;
        this.beratKg = beratKg;
        this.hargaSewa = hargaSewa;
    }

    // --- Getter dan Setter ---
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getBeratKg() {
        return beratKg;
    }
    public void setBeratKg(double beratKg) {
        this.beratKg = beratKg;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Method untuk menampilkan info, memanggil data lewat Getter
    public void tampilkanInfoDasar() {
        System.out.println("Merk        : " + getMerk());
        System.out.println("Berat       : " + getBeratKg() + " kg");
        System.out.println("Harga Sewa  : Rp " + getHargaSewa());
    }
}

// Kelas Anak 1 
class Tenda extends AlatPendakian {
    private int kapasitas;

    // Konstruktor
    public Tenda(String merk, double beratKg, double hargaSewa, int kapasitas) {
        super(merk, beratKg, hargaSewa); // Memanggil konstruktor Parent
        this.kapasitas = kapasitas;
    }

    // Getter dan Setter 
    public int getKapasitas() {
        return kapasitas;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void tampilkanInfoTenda() {
        System.out.println("--- Spesifikasi Tenda ---");
        tampilkanInfoDasar(); 
        System.out.println("Kapasitas   : " + getKapasitas() + " orang");
    }
}

// Kelas Anak 2 
class Carrier extends AlatPendakian {
    private int volumeLiter;

    // Konstruktor 
    public Carrier(String merk, double beratKg, double hargaSewa, int volumeLiter) {
        super(merk, beratKg, hargaSewa); // Memanggil konstruktor Parent
        this.volumeLiter = volumeLiter;
    }

    // Getter dan Setter 
    public int getVolumeLiter() {
        return volumeLiter;
    }
    public void setVolumeLiter(int volumeLiter) {
        this.volumeLiter = volumeLiter;
    }

    public void tampilkanInfoCarrier() {
        System.out.println("--- Spesifikasi Carrier ---");
        tampilkanInfoDasar(); 
        System.out.println("Volume      : " + getVolumeLiter() + " liter");
    }
}

// Kelas Main
public class DemoPendakian {
    public static void main(String[] args) {
        
        // 1. Membuat objek dengan nilai awal dari konstruktor
        Tenda tenda1 = new Tenda("Consina", 2.5, 45000.0, 4);
        Carrier carrier1 = new Carrier("Eiger", 1.8, 35000.0, 60);
        
        // 2. Menggunakan SETTER untuk mengubah nilai tertentu
        // saya mengubah harga sewa tenda menjadi 50000.0
        tenda1.setHargaSewa(50000.0);
        
        // saya mengubah volume carrier menjadi 65 liter
        carrier1.setVolumeLiter(65);
        
        // 3. Menampilkan output (data yang ditampilkan sudah data terbaru)
        tenda1.tampilkanInfoTenda();
        System.out.println();
        carrier1.tampilkanInfoCarrier();
        
        // 4. Contoh penggunaan GETTER untuk mengambil satu nilai saja secara spesifik
        System.out.println("\nCek merk carrier saja: " + carrier1.getMerk());
    }
}