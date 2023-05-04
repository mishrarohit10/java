import java.util.*;

public class graph {

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

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty() == false) {
            int u = q.poll();
            System.out.print(u + " ");
            for(int v: adj.get(u)) {
                if(visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,3,4);
    	addEdge(adj,2,4);

        System.out.println("Following is Breadth First Traversal: "); 
	    BFS(adj,V,0);
        printGraph(adj);
    }
}
