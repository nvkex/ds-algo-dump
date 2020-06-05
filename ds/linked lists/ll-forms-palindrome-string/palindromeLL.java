import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String key) {
        data = key;
        next = null;
    }
}

class Palindrome {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            Node head = new Node(a);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                String a1 = sc.next();
                addToTheLast(new Node(a1));
            }
            boolean res = Check.compute(head);
            if (res == true)
                System.out.println("True");
            else
                System.out.println("False");
        }
        sc.close();
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
}

class Check {
    public static boolean compute(Node node) {
        String str = "", rev = "";
        while (node != null) {
            str = str + node.data;
            rev = node.data + rev;
            node = node.next;
        }
        return str.equals(rev);
    }
}