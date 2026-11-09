public class Pegawai14 {
    public String nip;
    public String nama;

    public Pegawai14() { }

    public Pegawai14(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}
