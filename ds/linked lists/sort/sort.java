import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Absolute_List_Sort {
    Node head;

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
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        /*
         * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Absolute_List_Sort llist = new Absolute_List_Sort();
            // int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            Sort obj = new Sort();
            llist.head = obj.sortedList(llist.head);
            llist.printList(llist.head);
            t--;
        }
        sc.close();
    }
}

class Sort {
    Node sortedList(Node head) {
        Node ptr1 = head;
        while (ptr1.next != null) {
            Node ptr2 = ptr1.next;
            while (ptr2 != null) {
                if (ptr1.data > ptr2.data) {
                    int temp = ptr1.data;
                    ptr1.data = ptr2.data;
                    ptr2.data = temp;
                }
                ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
        }
        return head;
    }
}