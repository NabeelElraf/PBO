public class TenagaKependidikan14 extends Pegawai14 {
    public String kategori;

    public TenagaKependidikan14() { }

    public TenagaKependidikan14(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}
