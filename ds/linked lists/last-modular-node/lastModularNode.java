import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Modular {
    static Node head;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            int k = sc.nextInt();
            System.out.println(getNode.moduarNode(head, k));
        }
        sc.close();
    }
}

class getNode {
    public static int moduarNode(Node head, int k) {
        int i = 1, lastNode = -1;
        while (head != null) {
            if (i++ % k == 0)
                lastNode = head.data;
            head = head.next;
        }
        return lastNode;
    }
}