import java.util.Scanner;
public class MenghitungRumus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Rumus Fisika");
        System.out.println("Pilihan Rumus");
        System.out.println("1. Rumus mencari Kecepatan");
        System.out.println("2. Rumus mencari Jarak");
        System.out.println("3. Rumus mencari Waktu");
        System.out.print("Masukkan pilihan rumus: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan rumus tidak ada");
        }
    }

    static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memasuki perhitungan rumus KECEPATAN");
        System.out.print("Masukkan nilai jarak(s) dalam satuan km: ");
        float jarak = input.nextFloat();
        System.out.print("Masukkan nilai waktu(t) dalam satuan jam: ");
        float waktu = input.nextFloat();
        System.out.println("Nilai kecepatannya adalah: " + (jarak / waktu) + " km/jam");
    }

    static void hitungJarak() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memasuki perhitungan rumus JARAK");
        System.out.print("Masukkan nilai kecepatan(v) dalam satuan km/jam: ");
        float kecepatan = input.nextFloat();
        System.out.print("Masukkan nilai waktu(t) dalam satuan jam: ");
        float waktu = input.nextFloat();
        System.out.println("Nilai jarak adalah: " + (kecepatan * waktu) + " km");
    }

    static void hitungWaktu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memasuki perhitungan rumus WAKTU");
        System.out.print("Masukkan nilai jarak(s) dalam satuan km: ");
        float jarak = input.nextFloat();
        System.out.print("Masukkan nilai kecepatan(v) dalam satuan km/jam: ");
        float kecepatan = input.nextFloat();
        System.out.println("Nilai waktu adalah: " + (jarak / kecepatan) + " jam");
    }
}