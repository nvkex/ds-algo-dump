import java.util.Scanner;

// Driver Code
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }
            int k = sc.nextInt();
            Node res = GfG.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}


// My Code
class GfG {
    public static Node reverse(Node node, int k) {
        Node prev = null, curr = node, nxt = node;
        int n = k;
        while (n-- > 0 && curr != null) {
            nxt = nxt.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        if (node != null)
            node.next = reverse(nxt, k);
        return prev;

    }
}
