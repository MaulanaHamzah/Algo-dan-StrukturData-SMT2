package praktikum;

public class BinaryTreeArray02 {
    int[] data;
    int idxLast;

    public BinaryTreeArray02() {
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    // Method untuk menambahkan data ke dalam tree
    void add(int nilai) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = nilai;
        } else {
            System.out.println("Tree is full!");
        }
    }

    // Method untuk traversal in-order
    void traverseInOrder(int index) {
        if (index <= idxLast) {
            traverseInOrder(2 * index + 1);
            System.out.print(data[index] + " ");
            traverseInOrder(2 * index + 2);
        }
    }

    // Method untuk traversal pre-order
    void traversePreOrder(int index) {
        if (index <= idxLast) {
            System.out.print(data[index] + " ");
            traversePreOrder(2 * index + 1);
            traversePreOrder(2 * index + 2);
        }
    }

    // Method untuk traversal post-order
    void traversePostOrder(int index) {
        if (index <= idxLast) {
            traversePostOrder(2 * index + 1);
            traversePostOrder(2 * index + 2);
            System.out.print(data[index] + " ");
        }
    } 
}
