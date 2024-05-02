public class MyQueue03
{
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    MyQueue03(int n) {
        max = n;
        antrian = new Pembeli[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Pembeli antri) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = antri;
            size++;
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    Pembeli dequeue() {
        if (!isEmpty()) {
            Pembeli temp = antrian[front];
            front = (front + 1) % max;
            size--;
            return temp;
        } else {
            System.out.println("Antrian kosong!");
            return null;
        }
    }

    void print() {
        if (!isEmpty()) {
            System.out.println("Antrian Pembeli:");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.println((i + 1) + ". " + antrian[idx].nama + " - " + antrian[idx].noHP);
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    Pembeli peek() {
        if (!isEmpty()) {
            return antrian[front];
        } else {
            System.out.println("Antrian kosong!");
            return null;
        }
    }

    Pembeli peekRear() {
        if (!isEmpty()) {
            return antrian[rear];
        } else {
            System.out.println("Antrian kosong!");
            return null;
        }
    }

    void peekPosition(String nama) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            if (antrian[idx].nama.equals(nama)) {
                System.out.println("Posisi antrian " + nama + ": " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian.");
        }
    }

    void daftarPembeli() {
        if (!isEmpty()) {
            System.out.println("Daftar Pembeli:");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.println((i + 1) + ". " + antrian[idx].nama + " - " + antrian[idx].noHP);
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }
}