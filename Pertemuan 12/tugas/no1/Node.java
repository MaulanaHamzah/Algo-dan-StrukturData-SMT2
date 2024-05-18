package tugas.no1;

public class Node {
    String nama;
    int nomer;
    Node prev, next;

    Node(Node prev, int nomer, String nama, Node next) {
        this.prev = prev;
        this.nomer = nomer;
        this.nama = nama;
        this.next = next;
    }
}
