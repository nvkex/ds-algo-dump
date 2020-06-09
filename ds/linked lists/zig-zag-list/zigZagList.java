import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class ZigZag {
    static Node head;

    public void addToTheLast(Node node) {
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
            if (n != 0) {
                ZigZag llist = new ZigZag();
                int a1 = sc.nextInt();
                Node head = new Node(a1);
                llist.addToTheLast(head);
                for (int i = 1; i < n; i++) {
                    int a = sc.nextInt();
                    llist.addToTheLast(new Node(a));
                }
            }
            GfG.zigzag(head);
            head = null;
        }
    }
}

class GfG {
    public static void zigzag(Node phead) {
        int flag = 0;
        Node prev = phead;
        Node curr = phead.next;
        Node nxt = curr.next;
        while (curr.next != null) {
            int temp;
            if (flag == 0) {
                if (prev.data >= curr.data && prev.data >= nxt.data) {
                    temp = curr.data;
                    curr.data = prev.data;
                    prev.data = temp;
                } else if (nxt.data >= curr.data && nxt.data >= prev.data) {
                    temp = curr.data;
                    curr.data = nxt.data;
                    nxt.data = temp;
                }
                flag = 1;
            } else {
                if (prev.data <= curr.data && prev.data <= nxt.data) {
                    temp = curr.data;
                    curr.data = prev.data;
                    prev.data = temp;
                } else if (nxt.data <= curr.data && nxt.data <= prev.data) {
                    temp = curr.data;
                    curr.data = nxt.data;
                    nxt.data = temp;
                }
                flag = 0;
            }
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }


        while(phead != null){
            System.out.print(phead.data+" ");
            phead = phead.next;
        }
        System.out.println();
    }
}