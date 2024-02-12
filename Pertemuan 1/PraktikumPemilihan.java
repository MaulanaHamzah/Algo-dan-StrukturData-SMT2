import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        float nilaiAkhir;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.print("Masukkan nilai tugas = ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai kuis = ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan nilai UTS = ");
        nilaiUTS = input.nextInt();
        System.out.print("Masukkan nilai UAS = ");
        nilaiUAS = input.nextInt();

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100) {
            System.out.println("============================");
            System.out.println("nilai tidak valid");
        } else {
            System.out.println("============================");
            nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS) / 4;
            System.out.println("nilai akhir: " + nilaiAkhir);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("nilai huruf: A");
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("nilai huruf: B+");
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("nilai huruf: B");
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("nilai huruf: C+");
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("nilai huruf: C");
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("nilai huruf: D");
            } else {
                System.out.println("nilai huruf: E");
            }
        }
    }
}
