import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList_Element_From_Last {
    Node head;
    Node tail;

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
            tail = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
            // int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            // System.out.println(llist.head.data);
            GfG g = new GfG();
            // System.out.println(k);
            System.out.println(g.getNthFromLast(llist.head, k));
            t--;
        }
    }
}

class GfG {
    int getNthFromLast(Node head, int n) {
        Node tmp1 = head;
        Node tmp2 = head;
        while (--n > 0) {
            tmp2 = tmp2.next;
            if (tmp2 == null)
                return -1;
        }
        while (tmp2.next != null) {
            tmp2 = tmp2.next;
            tmp1 = tmp1.next;
        }
        return tmp1.data;
    }
}
