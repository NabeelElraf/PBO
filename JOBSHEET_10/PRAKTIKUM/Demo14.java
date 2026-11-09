import java.util.ArrayList;

public class Demo14 {
    public static void main(String[] args) {
        Dosen14 dosen1 = new Dosen14("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen14 dosen2 = new Dosen14("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan14 tendik1 = new TenagaKependidikan14(
                "19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan14 tendik2 = new TenagaKependidikan14(
                "19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai14> daftarPegawai = new ArrayList<Pegawai14>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("=== Heterogenous Collection ===");
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        for (Pegawai14 pegawai : daftarPegawai) {
            pegawai.displayInfo();
            System.out.println();
        }

        System.out.println("=== Upcasting dan Downcasting ===");
        Pegawai14 pegawai1 = dosen1; // Upcasting dilakukan otomatis.
        pegawai1.displayInfo(); // Dynamic dispatch menjalankan versi Dosen14.
        if (pegawai1 instanceof Dosen14) {
            Dosen14 dosenHasilCast = (Dosen14) pegawai1;
            System.out.println("NIDN setelah downcast: " + dosenHasilCast.nidn);
            dosenHasilCast.mengajar();
        }

        System.out.println("\n=== Polymorphic Argument ===");
        train(dosen1);
        train(tendik1);

        System.out.println("\n=== Downcast yang Tidak Cocok ===");
        Pegawai14 pegawaiBiasa = new Pegawai14("00000000", "Pegawai Umum");
        System.out.println("pegawaiBiasa instanceof Dosen14: " + (pegawaiBiasa instanceof Dosen14));
        System.out.println("Downcast ke Dosen14 dilewati agar tidak terjadi ClassCastException.");
    }

    public static void train(Pegawai14 pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");
        if (pegawai instanceof Dosen14) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
        System.out.println();
    }
}
