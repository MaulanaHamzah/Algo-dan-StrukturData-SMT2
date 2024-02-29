import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void tampilkanInfo(int nomor) {
        System.out.println("Data Mahasiswa ke-" + nomor);
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("IPK : " + ipk);
        System.out.println();
    }
}

public class DataMahasiswa {
    public static double hitungRataRataIPK(Mahasiswa[] mahasiswaArray) {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mahasiswaArray.length;
    }

    public static Mahasiswa mahasiswaDenganIPKTertinggi(Mahasiswa[] mahasiswaArray) {
        Mahasiswa mahasiswaTertinggi = mahasiswaArray[0];
        for (int i = 1; i < mahasiswaArray.length; i++) {
            if (mahasiswaArray[i].ipk > mahasiswaTertinggi.ipk) {
                mahasiswaTertinggi = mahasiswaArray[i];
            }
        }
        return mahasiswaTertinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswaArray = new Mahasiswa[3];
        for (int i = 0; i < mahasiswaArray.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            String nama = scanner.next();
            System.out.print("Masukkan nim : ");
            String nim = scanner.next();
            System.out.print("Masukkan jenis kelamin (P/L) : ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = scanner.nextDouble();
            mahasiswaArray[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < mahasiswaArray.length; i++) {
            mahasiswaArray[i].tampilkanInfo(i + 1);
        }

        double rataRataIPK = hitungRataRataIPK(mahasiswaArray);
        System.out.println("Rata-rata IPK: " + rataRataIPK);

        Mahasiswa mahasiswaTertinggi = mahasiswaDenganIPKTertinggi(mahasiswaArray);
        System.out.println("Data Mahasiswa dengan IPK Tertinggi:");
        mahasiswaTertinggi.tampilkanInfo(1);
    }
}