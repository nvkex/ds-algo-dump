import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class circular_LinkedList {
    Node head, head1, head2; // head of lisl
    Node last = null;

    /* Linked list Node */
    /* Utility functions */
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Function to print linked list */
    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
        System.out.println();
    }

    void circular() {
        last = head;
        while (last.next != null)
            last = last.next;
        last.next = head;
    }

    public static void main(String args[]) {
        /*
         * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            circular_LinkedList llist = new circular_LinkedList();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            llist.circular();
            gfg g = new gfg();
            g.splitList(llist);
            llist.printList(llist.head1);
            llist.printList(llist.head2);
            t--;
        }
    }
}

class gfg {
    // Function to split a circular LinkedList
    void splitList(circular_LinkedList list) {
        Node t = list.head;
        list.head1 = list.head;
        Node mid = list.head;
        list.last.next = null;
        while (t != null && t.next != null && t.next.next != null) {
            mid = mid.next;
            t = t.next.next;
        }
        list.head2 = mid.next;
        list.last.next = list.head2;
        mid.next = list.head1;

    }
}