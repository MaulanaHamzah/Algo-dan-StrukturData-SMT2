package tugas.no2;

public class DLLFilm {
    Node head;
    int size;

    public DLLFilm() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        if (isEmpty()) {
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
        }
        size++;
    }

    public void add(int id, String judul, double rating, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas!");
        }
        if (isEmpty() || index == 0) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat menghapus!");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat menghapus!");
        } else if (size == 1) {
            removeFirst();
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai index diluar batas!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id);
                System.out.println("  Judul: " + tmp.judul);
                System.out.println("  Rating: " + tmp.rating);
                tmp = tmp.next;
            }
        }
    }

    public Node searchById(int id) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.id == id) {
                System.out.println("Data ID Film: " + id + " berada di index ke-" + index);
                return tmp;
            }
            tmp = tmp.next;
            index++;
        }
        return null;
    }

    public void sortDescendingByRating() {
        if (!isEmpty()) {
            for (Node current = head; current.next != null; current = current.next) {
                for (Node index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        int tempId = current.id;
                        String tempTitle = current.judul;
                        double tempRating = current.rating;
                        current.id = index.id;
                        current.judul = index.judul;
                        current.rating = index.rating;
                        index.id = tempId;
                        index.judul = tempTitle;
                        index.rating = tempRating;
                    }
                }
            }
        }
    }

    public int size() {
        return size;
    }
}
