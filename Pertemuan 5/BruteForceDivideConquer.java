import java.util.Scanner;

public class BruteForceDivideConquer {
    static class Faktorial {
        public int nilai;

        int faktorialBF(int n) {
            int fakto = 1;
            while (n > 0) {
                fakto *= n;
                n--;
            }
            return fakto;
        }
        int faktorialDC(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * faktorialDC(n - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt(); 
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " 
            + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide Conquer adalah " 
            + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}