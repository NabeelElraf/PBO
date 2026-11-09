public class Dosen14 extends Pegawai14 {
    public String nidn;

    public Dosen14() { }

    public Dosen14(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }
}
