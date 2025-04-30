/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Algorithm:-
    1. Declare a structure of node with value, next and constructor
    2. Declare the head and initialize it to the current node
    3. use the next of the current node and store the each node value with carry
    4. compare for carry and add it to the next of current node if any until last node
    5. return the next of the very first head node.


*/

class Node {
    public int val;
    public Node next;

    public Node(int v) {
        this.val = v;
    }


}

public class L8AddNums {


    public static Node getAddNums(Node l1, Node l2) {

        int carry = 0;
        Node head = new Node(0);
        Node current = head;

        while(l1 != null || l2 != null) {

            int temp1 = l1 != null ? l1.val : 0;
            int temp2 = l2 != null ? l2.val : 0;

            int sum = carry + temp1 + temp2;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;

        }

        if(carry > 0) {
            current.next = new Node(carry);
        }

        return head.next;


    }


    public static void main(String[] args){
        Node head1 = new Node(0);
        Node l1 = head1;
        l1.next = new Node(2);
        l1 = l1.next;
        l1.next = new Node(4);
        l1 = l1.next;
        l1.next = new Node(3);

        Node head2 = new Node(0);
        Node l2 = head2;
        l2.next = new Node(5);
        l2 = l2.next;
        l2.next = new Node(6);
        l2 = l2.next;
        l2.next = new Node(4);

        Node res = L8AddNums.getAddNums(head1.next, head2.next);

        while(res != null) {
            System.out.print("The add numbers result is: "+res.val);
            res = res.next;
        
        }


    }


}