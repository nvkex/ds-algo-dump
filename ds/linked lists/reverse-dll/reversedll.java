import java.io.*;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            Node head = null;
            for (int i = 0; i < n; i++)
                head = insertNode(head, Integer.parseInt(str[i]));
            head = reverseDLL(head);
            if (verify(head))
                displayList(head);
            else
                System.out.print("Your pointers are not correctly connected");
            System.out.println();
        }
    }

    public static Node insertNode(Node head, int data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            temp.next = new Node(data);
            prev = temp;
            temp = temp.next;
            temp.prev = prev;
        }
        return head;
    }

    public static void displayList(Node head) {
        // Head to Tail
        while (head.next != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(head.data);
    }

    public static Node reverseDLL(Node head) {
        Node cpy = head, temp, head1 = head;
        while (cpy != null) {
            head1 = cpy;
            temp = cpy.prev;
            cpy.prev = cpy.next;
            cpy.next = temp;
            cpy = cpy.prev;
        }
        return head1;
    }

    public static boolean verify(Node head) {
        int fl = 0;
        int bl = 0;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            fl++;
        }
        while (temp.prev != null) {
            temp = temp.prev;
            bl++;
        }
        return fl == bl;
    }
}
