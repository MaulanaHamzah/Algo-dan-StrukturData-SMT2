import java.util.Scanner;

public class MainQueue03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pembeli: ");
        int jumlahPembeli = scanner.nextInt();

        MyQueue03 antrianWarung = new MyQueue03(jumlahPembeli);

        int pilihan = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek antrian terdepan");
            System.out.println("4. Cek antrian paling belakang");
            System.out.println("5. Cek antrian berdasarkan nama");
            System.out.println("6. Tampilkan semua antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    if (antrianWarung.isFull()) {
                        System.out.println("Antrian penuh!");
                    } else {
                        scanner.nextLine();
                        System.out.print("Masukkan nama pembeli: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan nomor HP pembeli: ");
                        int noHP = scanner.nextInt();
                        antrianWarung.enqueue(new Pembeli(nama, noHP));
                        System.out.println("Pembeli ditambahkan ke dalam antrian.");
                    }
                    break;
                case 2:
                    Pembeli keluar = antrianWarung.dequeue();
                    if (keluar != null) {
                        System.out.println("Pembeli " + keluar.nama + " telah keluar dari antrian.");
                    }
                    break;
                case 3:
                    Pembeli terdepan = antrianWarung.peek();
                    if (terdepan != null) {
                        System.out.println("Antrian terdepan: " + terdepan.nama + " - " + terdepan.noHP);
                    }
                    break;
                case 4:
                    Pembeli belakang = antrianWarung.peekRear();
                    if (belakang != null) {
                        System.out.println("Antrian paling belakang: " + belakang.nama + " - " + belakang.noHP);
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Masukkan nama pembeli yang ingin ditemukan: ");
                    String namaCari = scanner.nextLine();
                    antrianWarung.peekPosition(namaCari);
                    break;
                case 6:
                    antrianWarung.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);

        scanner.close();
    }
}
