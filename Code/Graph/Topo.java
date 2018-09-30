import java.util.*; 
import java.io.*; 

class Topo {
    static class Graph {
        private int numV; 
        private List<Integer>[] adj;
        
        Graph(int numV) {
            this.numV = numV; 
            adj = new LinkedList[numV]; 
            for (int i = 0; i < numV; i++) {
                adj[i] = new LinkedList<>(); 
            }
        }

        void addEdge(int u, int v) {
            adj[u].add(v); 
        }

        void topoUtil(int v , boolean visited[], Stack<Integer> stack) {
            visited[v] = true; 
            Integer next; 
            Iterator<Integer> it = adj[v].iterator(); 
            while (it.hasNext()) {
                next = it.next(); 
                if (!visited[next]) {
                    topoUtil(next, visited, stack);
                }
            }

            //push the current vertex 
            stack.push(v); 
        }

        void topo() {
            //External Stack 
            Stack<Integer> stack = new Stack<>(); 
            boolean visited[] = new boolean[numV];
            for (int i = 0; i < numV; i++) {
                if (!visited[i]) {
                    topoUtil(i, visited, stack);
                }
            } 

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }

        }
    }

    // Driver method
    public static void main(String args[]){
        //Create a graph given in the above diagram
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological " +
                        "sort of the given graph");
        g.topo();
    }
}