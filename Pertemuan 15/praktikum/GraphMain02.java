package praktikum;

import java.util.Scanner;

public class GraphMain02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex: ");
        int v = scanner.nextInt();
        GraphMatriks02 gdg = new GraphMatriks02(v);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan vertex asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan vertex tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gdg.makeEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("Masukkan vertex asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan vertex tujuan: ");
                    tujuan = scanner.nextInt();
                    gdg.removeEdge(asal, tujuan);
                    break;

                case 3:
                    gdg.printDegrees();
                    break;

                case 4:
                    gdg.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan vertex asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan vertex tujuan: ");
                    tujuan = scanner.nextInt();
                    if (gdg.cekEdge(asal, tujuan)) {
                        System.out.println("Edge dari " + (char)('A' + asal) + " ke " + (char)('A' + tujuan) + " ada.");
                    } else {
                        System.out.println("Edge dari " + (char)('A' + asal) + " ke " + (char)('A' + tujuan) + " tidak ada.");
                    }
                    break;

                case 6:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}
