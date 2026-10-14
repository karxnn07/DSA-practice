package BST;

public class DeleteNode {
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

    public static Node insert(Node root, int val) { 
        if (root == null) {
             return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val); 
        } else if (root.data < val) { 
            root.right = insert(root.right, val);
        } 
        return root;
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if(root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static Node delete(Node root, int val) {
        if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data>val) {
            root.left = delete(root.left, val);
        }
        else {
            // case 1: leaf node
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2: single child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            // case 3: both children
            Node IS = findInOrderSuccessior(root.right);
            root.data = IS.data;
            delete(root.right, val);
        }
        return root;
    }

    public static Node findInOrderSuccessior(Node root) {
        while(root != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        root = delete(root, 01);
        System.out.println();

        inOrder(root);
    }
}
