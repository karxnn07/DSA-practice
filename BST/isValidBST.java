package BST;

public class isValidBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insertNode(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
    
        if (root.data > val) {
            root.left = insertNode(root.left, val);
        } 
        else {
            root.right = insertNode(root.right, val);
        }
    
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) 
               && isValidBST(root.right, root, max);
    }

    public static void main(String args[]) {
        int values[] = {1, 1, 1};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insertNode(root, values[i]);
        }

        if(isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}