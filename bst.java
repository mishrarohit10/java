
class Node {
    int key;
    Node left;
    Node right;
    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class bst {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
    	int x=16;

        root=insert(root,x);
	    inorder(root);

        if(search(root,x))
    	    System.out.print("Found");
    	else
    	    System.out.print("Not Found");
    }

    public static boolean search(Node root, int x) {
        if(root==null) {
            return false;
        }
        if(root.key==x) {
            return true;
        }
        else if(root.key>x) {
            return search(root.left, x);
        }
        else {
            return search(root.right, x);
        }
    }

    public static Node insert(Node root, int x) {
        if(root==null) {
            return new Node(x);
        }
        else if(root.key<x) {
            root.right = insert(root.right, x);
        }
        else if(root.key<x) {
            root.left = insert(root.left, x);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root!=null) {
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}
