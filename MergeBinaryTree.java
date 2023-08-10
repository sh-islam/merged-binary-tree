public class MergeBinaryTree {

    public BinaryTree.Node merge(BinaryTree.Node node1, BinaryTree.Node node2){
        // If one tree node is null then return the other tree node to be used as data
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        // Merge overlapping nodes and sum node value recursively
        node1.data += node2.data;
        node1.left = merge(node1.left, node2.left);
        node1.right = merge(node1.right, node2.right);  // O(2n) complexity
        return node1;   // Returning root of merged tree
    }
}



