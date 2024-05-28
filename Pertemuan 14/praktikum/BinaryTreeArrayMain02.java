package praktikum;

public class BinaryTreeArrayMain02 {
    public static void main(String[] args) {
        BinaryTreeArray02 bta = new BinaryTreeArray02();
        int[] values = {6, 4, 8, 3, 5, 7, 9};

        for (int value : values) {
            bta.add(value);
        }

        System.out.print("InOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("PreOrder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("PostOrder Traversal: ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
