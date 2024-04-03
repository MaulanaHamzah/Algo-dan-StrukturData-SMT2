public class Buku02 
{
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku02(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock)
    {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;

    }

    public String getKodeBuku()
    {
        return kodeBuku;
    }

    public void tampilDataBuku()
    {
        System.out.println("=====================");
        System.out.println("Kode Buku: " +kodeBuku);
        System.out.println("Judul Buku: " +judulBuku);
        System.out.println("Tahun Terbit: " +tahunTerbit);
        System.out.println("Pengarang: " +pengarang);
        System.out.println("Stock: " +stock);
    }
    
}