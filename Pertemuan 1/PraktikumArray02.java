import java.util.Scanner;
public class PraktikumArray02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah matakuliah: ");
        int jumlahMatakuliah = scanner.nextInt();
        
        String[] namaMatakuliah = new String[jumlahMatakuliah];
        int[] bobotSKS = new int[jumlahMatakuliah];
        int[] nilaiAngka = new int[jumlahMatakuliah];
        String[] nilaiHuruf = new String[jumlahMatakuliah];
        double[] bobotNilai = new double[jumlahMatakuliah];

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("\nMatakuliah ke-" + (i + 1));
            scanner.nextLine();
            System.out.print("Nama Matakuliah: ");
            namaMatakuliah[i] = scanner.nextLine();
            System.out.print("Bobot SKS: ");
            bobotSKS[i] = scanner.nextInt();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = scanner.nextInt();

            nilaiHuruf[i] = konversiNilaiAngkaKeHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiNilaiAngkaKeBobot(nilaiAngka[i]);
        }

        System.out.println("\nOutput:");

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Matakuliah: " + namaMatakuliah[i]);
            System.out.println("Nilai Angka: " + nilaiAngka[i]);
            System.out.println("Nilai Huruf: " + nilaiHuruf[i]);
            System.out.println("Bobot Nilai: " + bobotNilai[i]);
            System.out.println("Bobot SKS: " + bobotSKS[i]);
            System.out.println("-----------------------------");
        }
    }

    public static String konversiNilaiAngkaKeHuruf(int nilaiAngka) {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka >= 73 && nilaiAngka < 80) {
            return "B+";
        } else if (nilaiAngka >= 65 && nilaiAngka < 73) {
            return "B";
        } else if (nilaiAngka >= 60 && nilaiAngka < 65) {
            return "C+";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "C";
        } else if (nilaiAngka >= 39 && nilaiAngka < 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double konversiNilaiAngkaKeBobot(int nilaiAngka) {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return 4.0;
        } else if (nilaiAngka >= 73 && nilaiAngka < 80) {
            return 3.5;
        } else if (nilaiAngka >= 65 && nilaiAngka < 73) {
            return 3.0;
        } else if (nilaiAngka >= 60 && nilaiAngka < 65) {
            return 2.5;
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return 2.0;
        } else if (nilaiAngka >= 39 && nilaiAngka < 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}