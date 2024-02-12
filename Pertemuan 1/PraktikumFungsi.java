import java.util.Scanner;

public class PraktikumFungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = scanner.nextInt();

        String[] namaCabang = new String[jumlahCabang];
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.print("Masukkan nama cabang ke-" + (i + 1) + ": ");
            scanner.nextLine();
            namaCabang[i] = scanner.nextLine();
        }

        int[][] stockBunga = new int[jumlahCabang][4];
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Masukkan data stock bunga untuk cabang " + namaCabang[i] + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukkan stock bunga " + getNamaBunga(j) + ": ");
                stockBunga[i][j] = scanner.nextInt();
            }
        }

        for (int cabang = 0; cabang < jumlahCabang; cabang++) {
            int pendapatanCabang = hitungPendapatanCabang(stockBunga[cabang], hargaBunga);
            System.out.println("Pendapatan Cabang " + namaCabang[cabang] + ": " + pendapatanCabang);
        }
    }

    public static int hitungPendapatanCabang(int[] stock, int[] harga) {
        int pendapatanCabang = 0;
        for (int i = 0; i < stock.length; i++) {
            pendapatanCabang += stock[i] * harga[i];
        }
        return pendapatanCabang;
    }

    public static String getNamaBunga(int indeks) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        return namaBunga[indeks];
    }
}