/*

=> A graph is a non-linear data structure consists of
    vertices (Nodes) and Edges{Connection b/w. two vertices.
=> Represented by G(V,E).


TYPES OF GRAPH :
-----------------
1. Undirected Graph : A --- B
                      A is connected to B and vice-versa.
2. Directed Graph : A --> B
                      A points towards B.
3. Weighted Graph :
                    A ----> B (cost = 5)
                      Edges are associated with some weights

TERMINOLOGIES IN GRAPH :
-------------------------
1. Vertex : A node in the graph
2. Edge : Connection between two Vertices.
3. Adjacent Vertices : Two vertices connected by one Edge.
4. Degree : No. of Edges connected to a Vertex
5. In-Degree : No of incoming edges.
6. Out-Degree : No of outgoing edges.
7. Path : Sequence of Vertices connected by Edges.
8. Simple Path : Path where no repeated Vertices.
9. Cycle : Path that starts at a particular node/vertex and ends at the same node/vertex.
10. Sub-graph : Graph formed from the original graph


GRAPH TRAVERSAL
-----------------
a) BFS - Breadth First Search,
            -> uses Queue
            -> level by level traversal
            -> find shortest path in unweighted graph
       TC :  O(V+E)
b) DFS - Depth First Search
            -> uses stack or recursion
            -> goes deep before back-tracking,
       TC : O(V+E)
c ) Advanced Algorithms
            -> Dijkstra's Algorithm
                 - works on weighted graph
                 - No negative weights
                 - Uses PriorityQueue
             TC : O (V+E) logV

             -> BellMan Ford Algorithm (Single Source Shortest Path)
                  - Handles negative weight.
                  - detects negative cycle
             TC : O(VE)

             -> Floyd's Warshall Algorithm
                   - All pairs Shortest Path uses Dynamic Programming
             TC : O(V)^3

 */

// Simple undirected graph

/*
import java.util.ArrayList;

public class Graph {

    // Separate function to add edge
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);   // Remove this line if graph is directed
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create V empty lists
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Add edges using function
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // Print graph
        for (int i = 0; i < V; i++) {
            System.out.println(i + " --> " + graph.get(i));
        }
    }
}
*/

// DFS

/*
import java.util.ArrayList;

public class Graph {

    // Add edge function
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);   // Remove this line if directed graph
    }

    // DFS recursive function
    static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {

        visited[node] = true;
        System.out.print(node + " ");

        // for-each loop for neighbors
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        boolean[] visited = new boolean[V];

        System.out.println("DFS Traversal:");
        dfs(graph, 0, visited);   // Start DFS from node 0
    }
}
*/

// BFS (or) Level Order in Graph
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    // Function to add edge
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);   // Remove this line if directed graph
    }

    // BFS function
    static void bfs(ArrayList<ArrayList<Integer>> graph, int start, int V) {

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            // for-each loop for neighbors
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 8;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        //addEdge(graph, 4, 5);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);

        System.out.println("BFS (Level Order Traversal):");
        bfs(graph, 0, V);
    }
}

*/

//
//import java.util.ArrayList;
//
//public class Graph {
//
//    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
//        graph.get(u).add(v);
//        graph.get(v).add(u);
//    }
//
//    // DFS for cycle detection
//    static boolean dfs(ArrayList<ArrayList<Integer>> graph,
//                       int node,
//                       boolean[] visited,
//                       int parent) {
//
//        visited[node] = true;
//
//        for (int neighbor : graph.get(node)) {
//
//            if (!visited[neighbor]) {
//                if (dfs(graph, neighbor, visited, node)) {
//                    return true;
//                }
//            }
//            else if (neighbor != parent) {
//                // If visited and not parent → cycle found
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        int V = 5;
//
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//
//        for (int i = 0; i < V; i++) {
//            graph.add(new ArrayList<>());
//        }
//
//        // Add edges
//        addEdge(graph, 0, 1);
//        addEdge(graph, 1, 2);
//        addEdge(graph, 2, 3);
//        addEdge(graph, 3, 4);
//        addEdge(graph, 4, 0);   // This creates cycle
//
//        boolean[] visited = new boolean[V];
//
//        boolean hasCycle = false;
//
//        for (int i = 0; i < V; i++) {
//            if (!visited[i]) {
//                if (dfs(graph, i, visited, -1)) {
//                    hasCycle = true;
//                    break;
//                }
//            }
//        }
//
//        if (hasCycle)
//            System.out.println("Cycle Detected");
//        else
//            System.out.println("No Cycle");
//    }
//}

/*
import java.util.*;
public class graph2{
    static HashMap<String,ArrayList<String>> graph = new HashMap<>();
    static HashSet<String> visited = new HashSet<>();
    public static void main(String[] args) {
        graph.put("A", new ArrayList<>());
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>());
        graph.put("D", new ArrayList<>());
        addEdge("A","B");
        addEdge("B","C");
        addEdge("C","A");

        boolean hasCycle = false;
        for(String node: graph.keySet()){
            if(!visited.contains(node)){
                if(dfs(node,null)){
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("cycle present: " + hasCycle);
    }
    public static  void addEdge(String u, String v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static boolean  dfs(String node,String parent){
        visited.add(node);
        for(String neighbour: graph.get(node)){
            if(!visited.contains(neighbour)){
                return true;
            }
            else if(!neighbour.equals(parent)){
                return true;
            }
        }
        return false;
    }
}
 */


/*
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n= edges.length;
        parent = new int[n+1];
        for(int i=1;i<=n;i++) {
            parent[i] = i;
        }
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            if(find(u) == find(v)) {
                return edge;

            }
            union(u,v);
        }
        return new int[0];
    }
    private int find(int x) {
        if(parent[x]! = x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    private void union(int a,int b) {
        int rootA = find(a);
        int rootB = find(b);
        parent[rootA] = rootB;
    }
}
 */

// 994 - rotten apples
/*
public class Solution {

    static int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int minutes = 0;

        while (true) {

            boolean changed = false;


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {

                    if (grid[i][j] == 2) {


                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            grid[i - 1][j] = 3;
                            changed = true;
                        }


                        if (i + 1 < rows && grid[i + 1][j] == 1) {
                            grid[i + 1][j] = 3;
                            changed = true;
                        }

                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            grid[i][j - 1] = 3;
                            changed = true;
                        }


                        if (j + 1 < cols && grid[i][j + 1] == 1) {
                            grid[i][j + 1] = 3;
                            changed = true;
                        }
                    }
                }
            }


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 3) {
                        grid[i][j] = 2;
                    }
                }
            }

            if (!changed) break;

            minutes++;
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return minutes;
    }

    // public static void main(String[] args) {

    //     int[][] grid = {
    //             {2,1,1},
    //             {0,1,1},
    //             {1,0,1}
    //     };

    //     System.out.println(orangesRotting(grid));
    // }
}
*/


// Matrix = nearest neighboruing 0 min distance -- Q1. 5m nm n


// =====================================
// Dijkstra's Algorithm
//Pseudo Code
/*
Function Dijkstra(Graph, V, source):

    Create array dist[V]
    Create array visited[V]

    For i = 0 to V-1:
        dist[i] = INF
        visited[i] = false

    dist[source] = 0

    For count = 0 to V-1:
        u = vertex with minimum dist[u] among unvisited vertices
        visited[u] = true
        For v = 0 to V-1:
            If (not visited[v]
                AND Graph[u][v] != INF
                AND dist[u] + Graph[u][v] < dist[v]):

                    dist[v] = dist[u] + Graph[u][v]

    Return dist

 */


// dijkstra's algorithm

import java.util.*;
/*
public class Graph {

    public static void dijkstra(int[][] graph, int V, int source) {

        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        // Initialize distances
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[source] = 0;

        for (int count = 0; count < V - 1; count++) {

            // Find minimum distance vertex
            int min = Integer.MAX_VALUE;
            int u = -1;

            for (int i = 0; i < V; i++) {
                if (!visited[i] && dist[i] < min) {
                    min = dist[i];
                    u = i;
                }
            }

            visited[u] = true;

            // Update distances of neighbors
            for (int v = 0; v < V; v++) {
                if (!visited[v]
                        && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print result
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "        " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 2, 4, 0, 0},
                {2, 0, 1, 7, 0},
                {4, 1, 0, 0, 3},
                {0, 7, 0, 0, 1},
                {0, 0, 3, 1, 0}
        };

        int V = 5;
        int source = 0;

        dijkstra(graph, V, source);
    }
}


*/
/*
// Bellman ford
public class Graph {

    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    static int V = 5;   // number of vertices
    static int E = 8;   // number of edges

    public static void bellmanFord(Edge[] edges, int source) {

        int[] dist = new int[V];

        // Step 1: Initialize
        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        dist[source] = 0;

        // Step 2: Relax edges V-1 times
        for (int i = 1; i <= V - 1; i++) {
            for (int j = 0; j < E; j++) {

                int u = edges[j].src;
                int v = edges[j].dest;
                int w = edges[j].weight;

                if (dist[u] != Integer.MAX_VALUE &&
                        dist[u] + w < dist[v]) {

                    dist[v] = dist[u] + w;
                }
            }
        }

        // Step 3: Check negative cycle
        for (int j = 0; j < E; j++) {
            int u = edges[j].src;
            int v = edges[j].dest;
            int w = edges[j].weight;

            if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + w < dist[v]) {

                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        // Print result
        System.out.println("Shortest distances:");
        for (int i = 0; i < V; i++) {
            System.out.println("To " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        Edge[] edges = new Edge[E];

        edges[0] = new Edge(0, 1, -1);
        edges[1] = new Edge(0, 2, 4);
        edges[2] = new Edge(1, 2, 3);
        edges[3] = new Edge(1, 3, 2);
        edges[4] = new Edge(1, 4, 2);
        edges[5] = new Edge(3, 2, 5);
        edges[6] = new Edge(3, 1, 1);
        edges[7] = new Edge(4, 3, -3);

        bellmanFord(edges, 0);
    }
}
*/