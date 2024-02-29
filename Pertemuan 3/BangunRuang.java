import java.util.Scanner;

class Kerucut {
    private double radius;
    private double sisiMiring;
    public Kerucut(double radius, double sisiMiring) {
        this.radius = radius;
        this.sisiMiring = sisiMiring;
    }
    public double hitungLuasPermukaan() {
        return Math.PI * radius * (radius + sisiMiring);
    }
    public double hitungVolume() {
        return (1 / 3) * Math.PI * radius * radius * sisiMiring;
    }
}

class LimasSegiEmpat {
    private double panjangSisiAlas;
    private double tinggi;
    public LimasSegiEmpat(double panjangSisiAlas, double tinggi) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggi = tinggi;
    }
    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggi);
    }
    public double hitungVolume() {
        return (1 / 3) * panjangSisiAlas * panjangSisiAlas * tinggi;
    }
}

class Bola {
    private double radius;
    public Bola(double radius) {
        this.radius = radius;
    }
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * radius * radius;
    }
    public double hitungVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}

public class BangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = scanner.nextInt();

        Object[] bangunRuangArray = new Object[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            System.out.print("Pilih jenis bangun ruang (1. Kerucut, 2. Limas Segi Empat, 3. Bola): ");
            int jenisBangunRuang = scanner.nextInt();

            switch (jenisBangunRuang) {
                case 1:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double radiusKerucut = scanner.nextDouble();
                    System.out.print("Masukkan sisi miring kerucut: ");
                    double sisiMiringKerucut = scanner.nextDouble();
                    bangunRuangArray[i] = new Kerucut(radiusKerucut, sisiMiringKerucut);
                    break;

                case 2:
                    System.out.print("Masukkan panjang sisi alas limas segi empat: ");
                    double panjangSisiAlasLimas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi limas segi empat: ");
                    double tinggiLimas = scanner.nextDouble();
                    bangunRuangArray[i] = new LimasSegiEmpat(panjangSisiAlasLimas, tinggiLimas);
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari bola: ");
                    double radiusBola = scanner.nextDouble();
                    bangunRuangArray[i] = new Bola(radiusBola);
                    break;

                default:
                    System.out.println("Jenis bangun ruang tidak valid.");
                    i--;
                    break;
            }
        }

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nHasil perhitungan untuk Bangun Ruang ke-" + (i + 1));
            if (bangunRuangArray[i] instanceof Kerucut) {
                Kerucut kerucut = (Kerucut) bangunRuangArray[i];
                System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuasPermukaan());
                System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
            } else if (bangunRuangArray[i] instanceof LimasSegiEmpat) {
                LimasSegiEmpat limas = (LimasSegiEmpat) bangunRuangArray[i];
                System.out.println("Luas Permukaan Limas Segi Empat: " + limas.hitungLuasPermukaan());
                System.out.println("Volume Limas Segi Empat: " + limas.hitungVolume());
            } else if (bangunRuangArray[i] instanceof Bola) {
                Bola bola = (Bola) bangunRuangArray[i];
                System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
                System.out.println("Volume Bola: " + bola.hitungVolume());
            }
        }
    }
}