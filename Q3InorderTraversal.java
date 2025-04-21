//Q3. Write a program to print the inorder traversal of a binary tree.
 
 // Algorithm :-
 // 1. Create a Node class
 // 2. Save the elements in it
 // 3. Traverse from left to right
 // 4. Print the element in the inorder traversal passion.
 
 class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }

  
}

public class Q3InorderTraversal {

   


    public static void printInorderTraversal(Node node) {


        if(node == null) {
            return;
        }
        printInorderTraversal(node.left);
        System.out.println(node.data);   

        printInorderTraversal(node.right);


    }

    public static void main(String[] strings) {
        Node root = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        root.left = node1;
        root.right = node2;
        root.left.left = node3;
        root.left.right = node4;
        root.right.right = node5;

        Q3InorderTraversal.printInorderTraversal(root);



    }
    
}