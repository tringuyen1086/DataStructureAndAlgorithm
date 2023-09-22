package tri.nguyen;

import java.util.ArrayList;

public class AdjacencyMatrix {

    /*
    Adjacency Matrix:       A 2D array to store 1's / 0's to represent edges
                            Number of rows      =   Number of unique nodes
                            Number of columns   =   Number of unique nodes

    Runtime Complexity:     to check an Edge: O(1)

    Space Complexity:       O(v^2) (v = vertex)
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

        /*

        Adjacency Matrix

        A      →      B

        ↑      ↙      ↆ       D
                           ↗
        E      ⇄      C

        */

        System.out.println("Edge between node A and B: " + graph.checkEdge(0,1));
        System.out.println("Edge between node D and C: " + graph.checkEdge(3,2));
    }

    public static class Node{

        char data;

        Node(char data){
            this.data = data;
        }
    }

    public static class Graph {

        ArrayList<Node> nodes;
        int[][] matrix;

        Graph(int size){
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }

        public void addNode(Node node){
            nodes.add(node);

        }

        public void addEdge(int src, int dst){
            // src (source)         =   row
            // dst (destination)    =   column
            matrix[src][dst] = 1;
        }

        public boolean checkEdge(int src, int dst){
            if(matrix[src][dst] == 1){
                return true;
            }
            else {
                return false;
            }
        }

        public void print(){
            System.out.print("    ");

            // print header for columns
            for (Node node : nodes){
                System.out.print(node.data + " | ");
            }
            System.out.println();

//            System.out.println("  |---|---|---|---|---|");
            // print rows
            for (int i = 0; i < matrix.length; i++){
                System.out.println("  |---|---|---|---|---|");
                // print header for rows
                System.out.print(nodes.get(i).data + " | ");
                // print columns
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " | ");
                }
                System.out.println();
//                System.out.println("  |---|---|---|---|---|");;
            }
        }
    }
}
