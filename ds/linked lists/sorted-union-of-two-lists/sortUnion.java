import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG2 {
    Node head, tail;

    /* Function to print linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        /*
         * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            GFG2 llist1 = new GFG2();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist1.addToTheLast(new Node(a));
            }
            llist1.head = head;
            n = sc.nextInt();
            a1 = sc.nextInt();
            GFG2 llist2 = new GFG2();
            Node head2 = new Node(a1);
            llist2.addToTheLast(head2);
            llist2.head = head2;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist2.addToTheLast(new Node(a));
            }
            GFG obj = new GFG();
            Node start = obj.findUnion(llist1.head, llist2.head);
            llist1.printList(start);
        }
    }
}

class GFG {
    Node findUnion(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<Integer>();

        // Add values to HashSet
        while (true) {
            if (head1 != null) {
                set.add(head1.data);
                head1 = head1.next;
            }
            if (head2 != null) {
                set.add(head2.data);
                head2 = head2.next;
            }
            if (head1 == null && head2 == null)
                break;
        }

        // Sort HashSet
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        // Store sorted set into linked list
        Node node = new Node(0);
        Node temp = node;
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            temp.next = new Node(itr.next());
            temp = temp.next;
        }
        return node.next;

    }
}