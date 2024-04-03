import java.util.Scanner;

public class BukuMain02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku02 data = new PencarianBuku02();
        int jumBuku = 3;

        System.out.println();
        System.out.println("========================================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil !");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=======================");
            System.out.print("Kode Buku     : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku    : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit  : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang     : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock         : ");
            int stock = s.nextInt();

            Buku02 m = new Buku02(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("=============================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("=============================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Judul Buku yang Dicari :");
        System.out.print("Judul Buku: ");
        String cariJudul = s1.nextLine();

        System.out.println("=============================");
        System.out.println("Menggunakan Sequential Search");
        int posisiJudul = data.findSequentialSearchByTitle(cariJudul);
        data.tampilPosisi(cariJudul, posisiJudul);
        data.tampilData(cariJudul, posisiJudul);
        data.searchAndWarnDuplicateTitles(cariJudul);


        System.out.println("=============================");
        System.out.println("Menggunakan Binary Search");
        int posisiJudulBinary = data.findBinarySearchByTitle(cariJudul);
        data.tampilPosisi(cariJudul, posisiJudulBinary);
        data.tampilData(cariJudul, posisiJudulBinary);
        data.searchAndWarnDuplicateTitles(cariJudul);
    }
}
