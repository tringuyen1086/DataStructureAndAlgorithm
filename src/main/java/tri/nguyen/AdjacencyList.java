package tri.nguyen;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {

    /*
    Adjacency List:         An Array / ArrayList of LinkedLists
                            Each LinkedList has a unique node at the head
                            All adjacent neighbors to that node are added to that node's linkedList

    Runtime Complexity:     runtime complexity to check an Edge: O(v)

    Space Complexity:       O(v + e) (v = vertex; e = edge)
    */

    public static void main(String[] args) {

        Graph graph = new Graph();

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

        /*

         Adjacency Matrix

        A      →      B

        ↑      ↙      ↆ       D
                           ↗
        E      ⇄      C


        converted to Adjacency List


        A      →      B
        B      →      C      →      E
        C      →      D      →      E
        D      →
        E      →      A      →      C



         */
    }

    public static class Node{
        char data;
        Node (char data){
            this.data = data;
        }
    }
    public static class Graph{

        ArrayList<LinkedList<Node>>  aList;

        Graph(){
            aList = new ArrayList<>();
        }

        public void addNode(Node node){
            LinkedList<Node> currentList = new LinkedList<>();
            currentList.add(node);
            aList.add(currentList);

        }

        // src(source)          =   row
        // dst (destination)    =   column
        public void addEdge(int src, int dst){
            LinkedList<Node> currentList = aList.get(src);
            Node dstNode = aList.get(dst).get(0);
            currentList.add(dstNode);
        }

        public boolean checkEdge(int src, int dst){
            LinkedList<Node> currentList = aList.get(src);
            Node dstNode = aList.get(dst).get(0);

            for(Node node: currentList){
                if (node == dstNode){
                    return true;
                }
            }
            return false;
        }

        public void print(){
            for(LinkedList<Node> currentList: aList){
                for(Node node: currentList){
                    System.out.print(node.data + " -> ");
                }
                System.out.println();
            }

        }



    }
}
