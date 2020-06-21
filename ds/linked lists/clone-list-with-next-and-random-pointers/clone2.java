/**
 * QUESTION:
 * You are given a Singly Linked List with N nodes where each node next pointing to its next node. 
 * You are also given M random pointers , where you will be given M number of pairs denoting two nodes a and b  i.e. a->arb = b.
 * 
 * INPUT:
 * First line of input contains number of testcases T. 
 * For each testcase, first line of input contains two integers N and M. 
 * Next line of input contains values of N nodes of the linked list and last line contains M pairs denoting arbitrary connecting  nodes, 
 * for which each ith node is connected to any jth node. ( ith->arb = jth ).
 * 
 * NOTE: 
 * If their is any node whose arbitrary pointer is not given then its by default null.
 * 
 * OUTPUT:
 * For each testcase, clone the given linked list.
 * 
 * Complexity: O(n)
 * Space: O(1)
 */

import java.util.Scanner;


// Driver Code
class Node {
    int data;
    Node next, arb;

    Node(int d) {
        data = d;
        next = arb = null;
    }
}

class Cloning {
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

    public static boolean validation(Node head, Node res, Node cloned_add, Node generated_add) {
        if (generated_add == cloned_add)
            return false;
        Node temp1 = head;
        Node temp2 = res;
        int len1 = 0, len2 = 0;
        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }
        /* if lengths not equal */
        if (len1 != len2)
            return false;
        temp1 = head;
        temp2 = res;
        while (temp1 != null) {
            if (temp1.data != temp2.data)
                return false;
            if (temp1.arb != null && temp2.arb != null) {
                if (temp1.arb.data != temp2.arb.data)
                    return false;
            } else if (temp1.arb != null && temp2.arb == null)
                return false;
            else if (temp1.arb == null && temp2.arb != null)
                return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    // public static void printList()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Node generated_add = null;
            int n = sc.nextInt();
            int q = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            for (int i = 0; i < q; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                Node tempA = head;
                int count = -1;
                while (tempA != null) {
                    count++;
                    if (count == a - 1)
                        break;
                    tempA = tempA.next;
                }
                Node tempB = head;
                count = -1;
                while (tempB != null) {
                    count++;
                    if (count == b - 1)
                        break;
                    tempB = tempB.next;
                }
                // when both a is greater than N
                if (a <= n)
                    tempA.arb = tempB;
            }
            generated_add = head;
            Clone g = new Clone();
            Node res = g.copyList(head);
            Node cloned_add = res;
            if (validation(head, res, cloned_add, generated_add) == true)
                System.out.println("1");
            else
                System.out.println("false");
        }
    }
}


// My Code
class Clone {
    Node copyList(Node head) {
        Node tempH = head;
        Node tmp;

        while(tempH != null){
            tmp = tempH.next;
            tempH.next = new Node(tempH.data);
            tempH.next.next = tmp;
            tempH = tempH.next.next;
        }

        tempH = head;
        Node copy = head.next;
        Node copyH = copy;
        while(tempH != null){

            if(tempH.arb == null)
                tempH.next.arb = null;
            else
                tempH.next.arb = tempH.arb.next;
                
            tempH = tempH.next.next;
        }
        tempH = head;
        while(tempH != null){
            if(copy.next != null)
                copy.next = copy.next.next;
            
            if(tempH.next != null)
                tempH.next = tempH.next.next;
            copy = copy.next;
            tempH = tempH.next;
        }

        return copyH;
    }
}