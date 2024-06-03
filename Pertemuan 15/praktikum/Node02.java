package praktikum;

public class Node02 {
    int data, jarak;
    Node02 prev, next;

    Node02 (Node02 prev, int data, int jarak, Node02 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}