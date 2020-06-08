import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG1 {
    public static void printList(Node head) {
        Node start = head;
        System.out.print(head.data + " ");
        head = head.next;
        while (head != start) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node start = null, cur = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                Node ptr = new Node(a);
                if (start == null) {
                    start = ptr;
                    cur = ptr;
                } else {
                    cur.next = ptr;
                    cur = ptr;
                }
            }
            int delNode = sc.nextInt();
            cur.next = start;
            Node head = GFG.deleteNode(start, delNode);
            start = GFG.reverse(head);
            printList(start);
        }
    }
}

class GFG {
    // This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head, int d) {
        Node temp = head;
        while (temp.next.data != d)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }

    // This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node nxt = null;
        do {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        } while (curr != head);
        head.next = prev;
        return prev;
    }
}