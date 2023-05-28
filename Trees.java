import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {

    int data;
    Node left;
    Node right;

    Node(int key) {
        this.data = key;
        this.left = this.right = null;
    }
}

public class Trees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        System.out.println(levelOrder(root));
    }

    public static ArrayList<Integer> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if(root==null) {
            return ans;
        }

        q.offer(root);
        while(!q.isEmpty()) {
            if(q.peek().left != null) {
                q.offer(q.peek().left);
            }
            if(q.peek().right != null) {
                q.offer(q.peek().right);
            }
            ans.add(q.poll().data);
        }
        return ans;
    }
}