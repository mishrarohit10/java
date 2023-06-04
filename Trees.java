import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}
public class Trees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        ArrayList<Integer> list = new ArrayList<>();
        // preOrder(root,list);
        // ArrayList<Integer> ans = levelOrder(root);
        // for(int i: ans) {
        //     System.out.print(i + " ");
        // }
        // for(Integer i: list) {
        //     System.out.println(i);
        // }
        int height = height(root);
        System.out.println(height);
    }

    static void preOrder(Node root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right, list);
    }

    static ArrayList<Integer> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) {
            return list;
        }
        q.add(root);
        while(!q.isEmpty()) {
            if(q.peek().left != null) {
                q.add(q.peek().left);
            }
            if(q.peek().right != null) {
                q.add(q.peek().right);
            }
            list.add(q.poll().val);
        }
        return list;
    }

    public static int height(Node root) {
        if(root==null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return 1 + Math.max(l,r);
    }
    
}
