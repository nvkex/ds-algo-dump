import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    public Node(int d) {
        this.data = d;
        prev = null;
        next = null;
    }
}

class doubly_LL {
    static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            // Entering the data
            Node head = new Node(sc.nextInt());
            Node curr = head;
            // Entering the rest of the list
            for (int i = 0; i < n - 1; i++) {
                int d = sc.nextInt();
                curr.next = new Node(d);
                curr = curr.next;
            }
            rotate obj = new rotate();
            display(obj.rotateP(head, p));
        }
        sc.close();
    }
}

class rotate {
    Node rotateP(Node head, int p) {
        Node start, end = head;
        while (end.next != null)
            end = end.next;
        while (p-- != 0) {
            start = head;
            head = head.next;
            end.next = start;
            start.prev = end;
            start.next.prev = null;
            start.next = null;
            end = end.next;
        }
        return head;
    }
}