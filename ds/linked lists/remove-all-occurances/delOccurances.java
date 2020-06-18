import java.util.Scanner;

// Driver Code
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DeleteAllOccuances {
    Node head;

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            int x = sc.nextInt();
            Node result = GfG.deleteAllOccurances(head, x);
            printList(result);
            t--;
        }
    }
}// } Driver Code Ends

// My Code
class GfG {
    public static Node deleteAllOccurances(Node head, int x) {
        Node temp = new Node(0);
        Node newH = temp;
        temp.next = head;
        while (temp.next != null) {
            if (temp.next.data == x)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return newH.next;
    }
}