package tugas.no1;
import java.util.Scanner;

public class VaksinasiMain {
    public static void main(String[] args) throws Exception {
        DLLVaksinasi queue = new DLLVaksinasi();
        Scanner input = new Scanner(System.in);
        int choice;
        final int MAX_QUEUE = 8;

        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Pengantri Vaksin Extravaganza");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                if (queue.size() < MAX_QUEUE) {
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor antrian:");
                    int nomer = input.nextInt();
                    input.nextLine();
                    System.out.println("Nama Penerima:");
                    String nama = input.nextLine();
                    queue.addLast(nomer, nama);
                } else {
                    System.out.println("Antrian sudah penuh!");
                }
                break;
                
                case 2:
                try {
                    String nama = queue.removeFirst();
                    System.out.println(nama + " telah selesai divaksinasi");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
                case 3:
                    System.out.println("------------------------");
                    System.out.println("Daftar Pengantri Vaksin:");
                    System.out.println("------------------------");
                    System.out.println("|No.       |Nama       |");
                    queue.print();
                    System.out.println("Sisa antrian: " + queue.size());
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
            System.out.println();
        } while (choice != 4);
        input.close();
    } 
}
