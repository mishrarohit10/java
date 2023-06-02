import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // preOrder(root);
        levelOrder(root);
    }

    static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node tempNode = q.poll();
            System.out.println(tempNode.data);
            if(tempNode.left != null) {
                q.add(tempNode.left);
            }
            if(tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
    }
}
