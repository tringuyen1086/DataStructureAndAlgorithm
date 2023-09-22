package tri.nguyen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    /*
    Breath First Search:     A search algorithm for traversing a tree or graph data structure
                            This is done one "level" at a time, rather than one "branch" at a time



    Runtime Complexity:     runtime complexity to check an Edge: O(v)

    Space Complexity:       O(v + e) (v = vertex; e = edge)
    */

    /*
    Breath First Search Algorithm

    A   —   B   —   C

    |               |

    D   —   E       F

    |       |       |

    G   —   H       I

    Queue: Traversing one "level" at a time rather than one "branch" at a time like Depth First Search Algorithm

    A   —   B   —   D   —   C   —   E   —   G   —   F   —   H   —   I

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

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println();

        System.out.println("Search starting from node A: ");
        graph.breadthFirstSearch(0);
        System.out.println();

        System.out.println("Search starting  node B: ");
        graph.breadthFirstSearch(1);
        System.out.println();

        System.out.println("Search starting from node C: ");
        graph.breadthFirstSearch(2);
        System.out.println();

        System.out.println("Search starting from node D: ");
        graph.breadthFirstSearch(3);
        System.out.println();

        System.out.println("Search starting from node E: ");
        graph.breadthFirstSearch(4);
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

        public void breadthFirstSearch(int src) {

            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[matrix.length];

            queue.offer(src); // add/insert an element to the queue
            visited[src] = true;

            while (queue.size() != 0) {
                src = queue.poll(); // remove an element from the head of the queue
                System.out.println(nodes.get(src).data + " = visited");

                for (int i = 0; i < matrix[src].length; i++) {
                    // check to see if there is an adjacent node and not visited, add it to the queue
                    if (matrix[src][i] == 1 && !visited[i]) {
                        queue.offer(i);
                        visited[i] = true;
                    }
                }
            }
        }
    }
}

