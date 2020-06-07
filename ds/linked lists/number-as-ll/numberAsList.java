import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class AddOne {
    static Node head;

    public static void insert(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("1");
                continue;
            }
            head = null;
            while (n > 0) {
                insert(new Node(n % 10));
                n /= 10;
            }
            GfG g = new GfG();
            Node mnode = g.addOne(head);
            print(mnode);
            System.out.println();
        }
    }

    public static void print(Node mnode) {
        while (mnode != null) {
            System.out.print(mnode.data);
            mnode = mnode.next;
        }
    }
}

class GfG {
    public Node addOne(Node head) {
        head.data = head.data + 1;
        Node tmp = head;
        while (tmp.next != null) {
            if (tmp.data > 9) {
                tmp.data = 0;
                tmp.next.data = tmp.next.data + 1;
            }
            tmp = tmp.next;
        }
        Node nxt = null;
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}