import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            // display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
        sc.close();
    }

    public static void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

class Solution {

    public Node insertInMid(Node head, int data) {
        Node node = new Node(data);
        Node temp1 = head;
        Node temp2 = head;
        while (temp1 != null && temp1.next != null && temp1.next.next != null) {
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }
        node.next = temp2.next;
        temp2.next = node;
        return head;
    }
}