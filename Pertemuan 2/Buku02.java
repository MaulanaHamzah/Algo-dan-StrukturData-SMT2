public class Buku02 {
    String judul, pengarang;
    int halaman, stok, harga, jmlTerjual;
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
            jmlTerjual = jml;
        }
    }
    void restock (int jml) {
        stok += jml;
    }
    void gantiHarga (int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal() {
        return harga * jmlTerjual;
    }
    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        if (harga > 150000) {
            return (int) (hargaTotal * 0.12);
        } else if (harga > 75000) {
            return (int) (hargaTotal * 0.05);
        } else {
            return 0;
        }
    }
    int hitungHargaBayar() {
        int hargaTotal = hitungHargaTotal();
        int diskon = hitungDiskon();
        int hargaBayar = hargaTotal - diskon;

        return hargaBayar;
    }
    public Buku02() {
        
    }
    public Buku02(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;    
    }
}