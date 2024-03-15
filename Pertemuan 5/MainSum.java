import java.util.Scanner;

public class MainSum {
    static class Perusahaan {
        int elemen;
        double keuntungan[], total;

        Perusahaan(int elemen) {
            this.elemen = elemen;
            this.keuntungan = new double[elemen];
            this.total = 0;
        }

        double totalBF(double arr[]) {
            for (int i = 0; i < elemen; i++) {
                total = total + arr[i];
            }
            return total;
        }

        double totalDC(double arr[], int l, int r) {
            if (l == r) {
                return arr[l];
            } else if (l < r) {
                int mid = (l + r) / 2;
                double lsum = totalDC(arr, l, mid);
                double rsum = totalDC(arr, mid + 1, r);
                return lsum + rsum;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan juta, misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();

        for (int perusahaanKe = 0; perusahaanKe < jumlahPerusahaan; perusahaanKe++) {
            System.out.println("============================");
            System.out.println("Perusahaan ke-" + (perusahaanKe + 1));
            System.out.print("Masukkan jumlah bulan: ");
            int elem = sc.nextInt();

            Perusahaan perusahaan = new Perusahaan(elem);
            System.out.println("============================");
            for (int i = 0; i < perusahaan.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
                perusahaan.keuntungan[i] = sc.nextDouble();
            }

            System.out.println("============================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan.elemen + " bulan adalah = " + perusahaan.totalBF(perusahaan.keuntungan));
            System.out.println("============================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan.elemen + " bulan adalah = " + perusahaan.totalDC(perusahaan.keuntungan, 0, perusahaan.elemen - 1));
        }
    }
}