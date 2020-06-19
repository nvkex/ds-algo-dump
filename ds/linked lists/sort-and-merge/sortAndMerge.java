/**
 * QUESTION:
 * Given K sorted linked lists of different sizes. 
 * The task is to merge them in such a way that after merging they will be a single sorted linked list.
 *
 * INPUT:
 * First line of input contains number of testcases T. 
 * For each testcase, first line of input contains number of linked lists N and next line contains data of nodes of all K linked lists, 
 * with first element as M, the length of linked list and next M elements for the same linked list.
 *
 * OUTPUT:
 * For each testcase, in a new line, print the merged linked list.
 */

import java.util.*;

// Driver Code
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class MergeLL {
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

    public static void printList(Node node) {
        if (node == null)
            return;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Node[] a = new Node[N];
            for (int i = 0; i < N; i++) {
                int n = sc.nextInt();
                int p = sc.nextInt();
                Node start = null, cur = null;
                Node head = new Node(p);
                start = head;
                cur = head;
                for (int j = 1; j < n; j++) {
                    int a1 = sc.nextInt();
                    Node ptr = new Node(a1);
                    cur.next = ptr;
                    cur = ptr;
                }
                a[i] = start;
            }
            Merge g = new Merge();
            Node res = g.mergeKList(a, N);
            if (res != null)
                printList(res);
            System.out.println();
        }
    }
}

// My Code
class Merge {
    Node mergeKList(Node[] a, int N) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node temp;
        for (int i = 0; i < N; i++) {
            temp = a[i];
            while (temp != null) {
                list.add(temp.data);
                temp = temp.next;
            }
        }
        Collections.sort(list);
        Node node = new Node(0);
        temp = node;
        for (int n : list) {
            temp.next = new Node(n);
            temp = temp.next;
        }
        return node.next;
    }
}