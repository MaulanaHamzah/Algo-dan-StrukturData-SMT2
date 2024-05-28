package tugas;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.println("Nilai terkecil: " + bt.findMin());
        System.out.println("Nilai terbesar: " + bt.findMax());
        
        System.out.print("Tampilkan leaf(daun): ");
        bt.printLeaves();
        System.out.println();
        
        System.out.println("Jumlah leaf(daun): " + bt.countLeaves());
    }
}
