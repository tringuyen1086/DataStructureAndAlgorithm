package tri.nguyen;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch {

     /*
    Depth First Search:     A search algorithm for traversing a tree or graph data structure
                            1. Pick a route
                            2. Keep going until you reach a dead end, or a previously visited node
                            3. Backtrack to last node that has unvisited adjacent neighbors
    */


    /*
    Depth First Search Algorithm for Adjacency Matrix

    A      →      B

    ↑      ↙      ↆ       D
                       ↗
    E      ⇄      C




    Depth First Search Algorithm

    A   —   B   —   C

    |               |

    D   —   E       F

    |       |       |

    G   —   H       I
    Stack(push) --> Revisited D --> backtrack (pop) the stack back to A --> stack(push) from A till reach the end
                    D (revisited)
    E               E                                                           I (the end)
    H               H                                                           F
    G               G                                                           C
    D               D                                                           B
    A               A                   A                                       A
    */


    /*
    Differences between BFS and DFS
    Breadth First Search:       Traverse a graph level by level
                                Utilizes a Queue
                                Better if destination is on average close to start
                                Siblings are visited before children

    Depth First Search:         Traverse a graph branch by branch
                                Utilizes a Stack
                                Better if destination is on average far from the start
                                Children are visited before siblings
                                More popular for games / puzzles
     */

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println();

        System.out.println("Search starting from node A: ");
        graph.depthFirstSearch(0);
        System.out.println();

        System.out.println("Search starting  node B: ");
        graph.depthFirstSearch(1);
        System.out.println();

        System.out.println("Search starting from node C: ");
        graph.depthFirstSearch(2);
        System.out.println();

        System.out.println("Search starting from node D: ");
        graph.depthFirstSearch(3);
        System.out.println();

        System.out.println("Search starting from node E: ");
        graph.depthFirstSearch(4);
        System.out.println();

        /*

        Adjacency Matrix

        A      →      B

        ↑      ↙      ↆ       D
                           ↗
        E      ⇄      C

        */
    }
    public static class Node {

        char data;

        Node(char data) {
            this.data = data;
        }
    }

    public static class Graph {

        ArrayList<Node> nodes;
        int[][] matrix;

        Graph(int size) {
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }

        public void addNode(Node node) {
            nodes.add(node);
        }

        public void addEdge(int src, int dst) {
            // src (source)         =   row
            // dst (destination)    =   column
            matrix[src][dst] = 1;
        }

        public boolean checkEdge(int src, int dst) {
            if (matrix[src][dst] == 1) {
                return true;
            } else {
                return false;
            }
        }

        public void print() {
            System.out.print("   ");

            // print header for columns
            for (Node node : nodes) {
                System.out.print(node.data + "  ");
            }
            System.out.println();

            // print rows
            for (int i = 0; i < matrix.length; i++) {

                // print header for rows
                System.out.print(nodes.get(i).data + "  ");
                // print columns
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }

        public void depthFirstSearch(int src){
            boolean[] visited = new boolean[matrix.length];
            dFSHelper(src, visited);

        }

        private void dFSHelper(int src, boolean[] visited){

            if(visited[src]){
                return;
            }
            else {
                visited[src] = true;
                System.out.println(nodes.get(src).data + " = visited");
            }

            // iterate over the rows (sources)
            for (int i = 0; i < matrix[src].length; i++){
                if (matrix[src][i] == 1){
                    dFSHelper(i, visited);
                }
            }
            return;
        }
    }
}
