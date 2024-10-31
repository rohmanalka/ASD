public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        BinaryTreeArray21 bta = new BinaryTreeArray21();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\n InOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("Pre-order traversal: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("Post-order traversal: ");
        bta.traversePostOrder(0);
        System.out.println();

        // Menambahkan elemen baru
        bta.add(1);
        bta.add(18);

        System.out.print("In-order traversal setelah add: ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}
