package praktikum;

public class Graph02 {
    int vertex;
    DoubleLinkedList02 list[];

    public Graph02(int v) {
        vertex = v;
        list = new DoubleLinkedList02[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList02();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }
        totalOut = list[asal].size();
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean hasPath(int asal, int tujuan) {
        boolean visited[] = new boolean[vertex];
        return DFS(asal, tujuan, visited);
    }
    
    private boolean DFS(int asal, int tujuan, boolean visited[]) {
        if (asal == tujuan) {
            return true;
        }
        
        visited[asal] = true;
        
        try {
            for (int i = 0; i < list[asal].size(); i++) {
                int nextNode = list[asal].get(i);
                if (!visited[nextNode] && DFS(nextNode, tujuan, visited)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
        boolean found = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].remove(i);
                list[asal].addFirst(tujuan, jarakBaru);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new Exception("Edge tidak ditemukan");
        }
    }

    public int hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        return totalEdge;
    }
}