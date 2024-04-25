import java.util.Scanner;

public class Utama02 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitasGudang = scanner.nextInt();
        scanner.nextLine();

        Gudang02 gudang = new Gudang02(kapasitasGudang);

        while (true) 
        {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Lihat barang terbawah");
            System.out.println("5. Cari barang");
            System.out.println("6. Tampilkan tumpukan barang");            
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) 
            {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang02 barangBaru = new Barang02(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.lihatBarangTeratas();
                    break;

                case 4:
                    gudang.lihatBarangTerbawah();
                    break;

                case 5:
                System.out.println("Pilih cara pencarian");
                System.out.println("1: berdasarkan kode");
                System.out.println("2: berdasarkan nama");
                System.out.print("Masukkan pilihan: ");
                int caraPencarian = scanner.nextInt();
                scanner.nextLine();
                switch (caraPencarian) {
                    case 1:
                        System.out.print("Masukkan kode barang yang ingin dicari: ");
                        int kodeBarang = scanner.nextInt();
                        scanner.nextLine();
                        gudang.cariBarang(kodeBarang);
                        break;
                    case 2:
                        System.out.print("Masukkan nama barang yang ingin dicari: ");
                        String namaBarang = scanner.nextLine();
                        gudang.cariBarang(namaBarang);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                }
                break;

                case 6:
                    gudang.tampilkanBarang();
                    break;

                case 7:
                    System.out.println("Terima kasih telah menggunakan program.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
