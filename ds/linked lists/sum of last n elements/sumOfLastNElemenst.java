import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution obj = new Solution();
            System.out.println(obj.sum(head, k));
        }
        sc.close();
    }
}

class Solution {

    public int sum(Node head, int k) {
        Node temp = head;
        int size = 0, sum = 0;
        while (temp != null) {
            size++;
            sum += temp.data;
            temp = temp.next;
        }
        while (size != 0) {
            if (size > k)
                sum -= head.data;
            head = head.next;
            size--;
        }
        return sum;

    }
}