import java.util.Scanner;
public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan NIM: ");
        String nim = input.nextLine();
        int angka2Terakhir = Integer.parseInt(nim.substring(Math.max(0, nim.length() - 2)));
        if (angka2Terakhir < 10) {
            angka2Terakhir += 10;
        }
        System.out.println("Nilai n: " + angka2Terakhir);
        
        generateSeries(angka2Terakhir);
    }
    public static void generateSeries(int n) {
        System.out.print("Hasil Output: ");
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }

                if (i == 12) {
                    break;
                }
            }
        }
    }
}