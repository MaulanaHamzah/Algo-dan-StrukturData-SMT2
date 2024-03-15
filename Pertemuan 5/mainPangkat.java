import java.util.Scanner;

public class mainPangkat {

    static class Pangkat {
        public int nilai, pangkat;

        public Pangkat(int nilai, int pangkat) {
            this.nilai = nilai;
            this.pangkat = pangkat;
        }

        int pangkatBF(int a, int n) {
            int hasil = 1;
            for (int i = 0; i < n; i++) {
                hasil *= a;
            }
            return hasil;
        }

        int pangkatDC(int a, int n) {
            if (n == 0) {
                return 1;
            }
            int temp = pangkatDC(a, n / 2);
            if (n % 2 == 1) {
                return temp * temp * a; // tahap combine
            } else {
                return temp * temp; // tahap combine
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan Anda: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                            + png[i].nilai + " pangkat "
                            + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                            + png[i].nilai + " pangkat "
                            + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}