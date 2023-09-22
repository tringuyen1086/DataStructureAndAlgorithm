package tri.nguyen;

public class Tree {
    /*
    Tree:                       a non-linear data structure where nodes are organized in a hierarchy
                                eg: File explorer; Databases; DNS; HTML DOM

    Node:                       piece of data

    Edge:                       represents a relationship between two nodes

    Root node:                  The top of the tree is known as the root node
                                Does not have any incoming edges
                                Only has outgoing edges

    Branch node:                Branch notes are in the middle of the root node and the leaf nodes
                                They have both incoming and outgoing edges

    Leaf node:                  Any nodes at the bottom of a tree are known as the leaf nodes
                                They do not have any outgoing edges
                                Only have incoming edges

    Parent node:                Any nodes wit outgoing edges are also known as parents

    Child node:                 Any node with an incoming edge is known as a child node

    Siblings node:              Any nodes that share the same parent are known as siblings nodes

    Parent/Child node:          Nodes can be both parents and children if they have both incoming and outgoing edges

    Subtree:                    A smaller tree held within a larger tree

    Size:                       Number of nodes

    Depth:                      Number of edges below the root node

    Height:                     Number of edges above furthest leaf node
     */

    /*
    Binary Tree:                A binary tree is a tree where each node has no more than two children
    Binary Search Tree:         The Binary Search Tree is different from Binary Tree
                                because the values are arranged in a certain order of a Binary Search Tree
                                The root node should be greater than the left child, but less than the right child.

    Runtime Complexity:         Best Case: O(log n)
                                Worst Case: O(n)

    Space Complexity:           O(n)
     */

    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

//        tree.remove(1);
//        tree.remove(8);
//        tree.remove(4);
//        tree.remove(6);
        tree.display();

        System.out.println(tree.search(5));
        System.out.println(tree.search(10));

        tree.remove(0);
    }

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class BinarySearchTree{

        Node root;
        public void insert(Node node) {

            root = insertHelper(root, node);

        }

        private Node insertHelper(Node root, Node node){

            int data = node.data;

            if (root == null){
                root = node;
                return root;
            }
            else if (data < root.data){
                root.left = insertHelper(root.left, node);
            }
            else {
                root.right = insertHelper(root.right, node);
            }

            return root;
        }

        public void display() {

            displayHelper(root);
        }

        private void displayHelper (Node root){

            if (root != null){
                displayHelper(root.left); // recursion
                System.out.println(root.data);
                displayHelper(root.right);
            }
        }

        public boolean search(int data) {

            return searchHelper(root, data);
        }
        private boolean searchHelper(Node root, int data){

            if (root == null){
                return false;
            }
            else if (root.data == data){
                return true;
            }
            else if (root.data > data){
                return searchHelper(root.left, data);
            }
            else {
                return searchHelper(root.right, data);
            }
        }

        public void remove(int data){

            if (search(data)){
                removeHelper(root, data);
            }
            else {
                System.out.println(data + " could not be found!");
            }

        }

        public Node removeHelper(Node root, int data) {

            if (root == null) {
                return root;
            } else if (data < root.data) {
                root.left = removeHelper(root.left, data);
            } else if (data > root.data) {
                root.right = removeHelper(root.right, data);
            } else {// node found
                if (root.left == null && root.right == null) {
                    root = null;
                } else if (root.right != null) { // find a successor to replace this node
                    root.data = successor(root);
                    root.right = removeHelper(root.right, root.data);
                } else { // find a predecessor to replace this node
                    root.data = predecessor(root);
                    root.left = removeHelper(root.left, root.data);
                }
            }
            return root;
        }

        private int successor(Node root){ // find the least value below the right child of this root node

            root = root.right;
            while (root.left != null){
                root = root.left;
            }
            return root.data;
        }

        private int predecessor(Node root){ // find the greatest value below the left child of this root node

            root = root.left;
            while (root.right != null){
                root = root.right;
            }
            return root.data;
        }
    }
}

