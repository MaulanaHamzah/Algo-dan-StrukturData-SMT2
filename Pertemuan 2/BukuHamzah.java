public class BukuHamzah {
    String judul, pengarang;
    int halaman, stok, harga;
    void tampilanInformasi() {
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("jumlah halaman: " + halaman);
        System.out.println("sisa stok: " + stok);
        System.out.println("harga: Rp " + harga);
    }
    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }
    void restock (int jml) {
        stok += jml;
    }
    void gantiHarga (int hrg) {
        harga = hrg;
    }
    public BukuHamzah() {

    }
    public BukuHamzah(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}