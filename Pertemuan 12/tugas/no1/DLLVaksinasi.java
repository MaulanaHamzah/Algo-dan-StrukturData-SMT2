package tugas.no1;

public class DLLVaksinasi {
    Node head;
    int size;

    public DLLVaksinasi() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomer, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomer, nama, null);
        } else {
            Node newNode = new Node(null, nomer, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomer, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomer, nama, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nomer, nama, null);
            current.next = newNode;
        }
        size++;
    }

    public void add(int nomer, String nama, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas!");
        } else if (index == 0) {
            addFirst(nomer, nama);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, nomer, nama, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }

    public String removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue masih kosong, tidak dapat menghapus!");
        } else {
            String nama = head.nama;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return nama;
        }
    }

    public String removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue masih kosong, tidak dapat menghapus!");
        } else if (head.next == null) {
            return removeFirst();
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            String nama = current.nama;
            current.prev.next = null;
            size--;
            return nama;
        }
    }

    public String remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai index diluar batas!");
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            String nama = current.nama;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            return nama;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("|" + tmp.nomer + "       |" + tmp.nama + "       |");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }
}
