package tri.nguyen;

public class TraverseTree {

    /*
    Traverse Tree:              a non-linear data structure where nodes are organized in a hierarchy
                                eg: File explorer; Databases; DNS; HTML DOM

    In-order:                   D B E A F C G
                                left --> root --> right

    Post-order:     `           D E B F G C A
                                left --> right --> root

    Pre-order:                  A B D E C F G
                                root --> left --> right

    Use Traverse Tree with Binary Tree (not Binary Search Tree)


                 A
               /   \
              /     \
             /       \
            B         C
           / \       / \
          D   E     F   G
     */

    public static void main(String[] args) {
        System.out.println("TraverseTree Algorithm: ");
        System.out.println("In-order Traverse Tree:     left -->    root   -->     right");
        System.out.println("Post-order Traverse Tree:   left -->    right  -->     root");
        System.out.println("Pre-order Traverse Tree:    root -->    left   -->     right");


    }

    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    private void traverseTreeInOrder(Node root){

        traverseTreeInOrder(root.left);
        System.out.println(root.data);
        traverseTreeInOrder(root.right);
    }

    private void traverseTreePostOrder(Node root){

        traverseTreeInOrder(root.left);
        traverseTreeInOrder(root.right);
        System.out.println(root.data);
    }

    private void traverseTreePreOrder(Node root){

        System.out.println(root.data);
        traverseTreeInOrder(root.left);
        traverseTreeInOrder(root.right);
    }

}
