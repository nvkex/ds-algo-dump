import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList_Intersection {
    Node head = null;
    Node tail = null;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = head;
        } else {
            // Node temp = head;
            // while (temp.next != null)
            // temp = temp.next;

            // temp.next = node;
            tail.next = node;
            tail = node;
        }
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int a1 = sc.nextInt();
            Node head1 = new Node(a1);
            Node tail1 = head1;
            for (int i = 1; i < n1; i++) {
                int a = sc.nextInt();
                tail1.next = (new Node(a));
                tail1 = tail1.next;
            }
            int b1 = sc.nextInt();
            Node head2 = new Node(b1);
            Node tail2 = head2;
            for (int i = 1; i < n2; i++) {
                int b = sc.nextInt();
                tail2.next = (new Node(b));
                tail2 = tail2.next;
            }
            int c1 = sc.nextInt();
            Node head3 = new Node(c1);
            tail1.next = head3;
            tail2.next = head3;
            Node tail3 = head3;
            for (int i = 1; i < n3; i++) {
                int c = sc.nextInt();
                tail3.next = (new Node(c));
                tail3 = tail3.next;
            }
            Intersect obj = new Intersect();
            System.out.println(obj.intersectPoint(head1, head2));
            t--;
        }
    }
}


// My Code
class Intersect {
    int intersectPoint(Node headA, Node headB) {
        Node tempA = headA, tempB = headB;
        while (tempA != null) {
            tempA.data = tempA.data * -1;
            if (tempA.data == 0)
                tempA.data = -66666666;
            tempA = tempA.next;
        }
        while (tempB != null) {
            if (tempB.data < 0) {
                if (tempB.data == -66666666)
                    return 0;
                else
                    return -tempB.data;
            }
            tempB = tempB.next;
        }

        return -1;
    }
}
