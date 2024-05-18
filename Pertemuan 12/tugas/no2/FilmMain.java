package tugas.no2;
import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) throws Exception {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        DLLFilm list = new DLLFilm();
        int choice, id, index;
        String judul;
        double rating;

        do {
            System.out.println("=====================");
            System.out.println("Data Film Layar Lebar");
            System.out.println("=====================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut data rating film - descending");
            System.out.println("10. Keluar");
            System.out.println("=====================");
            System.out.print("Pilih menu: ");
            choice = input1.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    id = input1.nextInt();
                    input1.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input1.next();
                    System.out.print("Rating Film: ");
                    rating = input2.nextDouble();
                    list.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.print("ID Film: ");
                    id = input1.nextInt();
                    System.out.print("Judul Film: ");
                    judul = input1.next();
                    System.out.print("Rating Film: ");
                    rating = input2.nextDouble();
                    list.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.print("ID Film: ");
                    id = input1.nextInt();
                    input1.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input1.next();
                    System.out.print("Rating Film: ");
                    rating = input2.nextDouble();
                    System.out.print("Masukkan index: ");
                    index = input2.nextInt();
                    list.add(id, judul, rating, index);
                    System.out.println("Data film ini akan masuk di urutan ke-" + (index + 1));
                    break;
                case 4:
                    list.removeFirst();
                    System.out.println("Data pertama telah dihapus");
                    break;
                case 5:
                    list.removeLast();
                    System.out.println("Data terakhir telah dihapus");
                    break;
                case 6:
                    System.out.print("Masukkan index: ");
                    index = input2.nextInt();
                    list.remove(index);
                    System.out.println("Data pada index ke-" + (index + 1) + " telah dihapus");
                    break;
                case 7:
                    list.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    id = input1.nextInt();
                    Node hasil = list.searchById(id);
                    if (hasil != null) {
                        System.out.println("IDENTITAS");
                        System.out.println("ID Film: " + hasil.id);   
                        System.out.println("Judul Film: " + hasil.judul);
                        System.out.println("Rating Film: " + hasil.rating);
                    } else {
                        System.out.println("Data dengan ID " + id + " tidak ditemukan");
                    }
                    break;
                case 9:
                    list.sortDescendingByRating();
                    System.out.println("Data telah diurutkan berdasarkan rating secara descending");
                    list.print();
                    break;
                case 10:
                    System.out.println("Keluar program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        } while (choice != 10);

        input1.close();
        input2.close();
    }
}
