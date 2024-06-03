package praktikum;

public class GraphMatriks02 {
    int vertex;
    int[][] matriks;

    public GraphMatriks02(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 0) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                } else if (i == j) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (0 m), ");
                }
            }
            System.out.println();
        }
    }

    // Method untuk menghitung outDegree dari suatu vertex
    public int getOutDegree(int vertex) {
        int outDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[vertex][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    // Method untuk menghitung inDegree dari suatu vertex
    public int getInDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[i][vertex] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    // Method untuk mencetak inDegree dan outDegree dari semua vertex
    public void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Vertex " + (char) ('A' + i) + ": inDegree = " + getInDegree(i) + ", outDegree = " + getOutDegree(i));
        }
    }

    // Method untuk mengecek apakah ada edge antara dua vertex
    public boolean cekEdge(int asal, int tujuan) {
        return matriks[asal][tujuan] != 0;
    }
}