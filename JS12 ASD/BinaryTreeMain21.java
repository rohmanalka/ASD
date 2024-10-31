public class BinaryTreeMain21 {
    public static void main(String[] args) {
        BinaryTree21 bt = new BinaryTree21();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("InOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node: " + bt.find(5));

        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");

        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

         // Menampilkan nilai paling kecil dalam tree
         int min = bt.findMin();
         System.out.println("Nilai paling kecil dalam tree: " + min);
 
         // Menampilkan nilai paling besar dalam tree
         int max = bt.findMax();
         System.out.println("Nilai paling besar dalam tree: " + max);
 
         // Menampilkan data yang ada di leaf
         System.out.print("Leaf Nodes: ");
         bt.displayLeafNodes(bt.root);
         System.out.println("");
 
         // Menghitung jumlah leaf yang ada di dalam tree
         int leafCount = bt.countLeafNodes(bt.root);
         System.out.println("Jumlah Leaf Nodes: " + leafCount);
     }
 }