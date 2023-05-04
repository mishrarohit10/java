import java.util.*;
class template {

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)  + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> createGraph(int v) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0; i<v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        return adj;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int v = in.nextInt();
            ArrayList<ArrayList<Integer>> adj = createGraph(v);
            addEdge(adj, 0, 1);
            addEdge(adj, 0, 2);
            addEdge(adj, 1, 2); 
            addEdge(adj, 1, 3); 
            printGraph(adj);
        }
    }
}