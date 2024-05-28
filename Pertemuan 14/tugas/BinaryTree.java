package tugas;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Method untuk menambahkan node dengan cara rekursif
    void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = addRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = addRecursive(root.right, data);
        }
        return root;
    }

    // Method untuk menampilkan nilai paling kecil
    int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node root) {
        if (root.left == null) {
            return root.data;
        } else {
            return findMinRecursive(root.left);
        }
    }

    // Method untuk menampilkan nilai paling besar
    int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node root) {
        if (root.right == null) {
            return root.data;
        } else {
            return findMaxRecursive(root.right);
        }
    }

    // Method untuk menampilkan data yang ada di leaf
    void printLeaves() {
        printLeavesRecursive(root);
    }

    private void printLeavesRecursive(Node root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print(root.data + " ");
            }
            printLeavesRecursive(root.left);
            printLeavesRecursive(root.right);
        }
    }

    // Method untuk menampilkan berapa jumlah leaf yang ada di dalam tree
    int countLeaves() {
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeavesRecursive(root.left) + countLeavesRecursive(root.right);
    }
}
