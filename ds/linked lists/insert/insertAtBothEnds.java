import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {
    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            LList myList = new LList();
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                if (a2 == 0)
                    myList.insertAtBeginning(a1);
                else
                    myList.insertAtEnd(a1);
            }
            myList.printList();
        }
        sc.close();
    }
}

class LList {
    Node head;

    // Should insert a node at the beginning
    void insertAtBeginning(int x) {
        Node n = new Node(x);
        n.next = head;
        head = n;
    }

    // Should insert a node at the end
    void insertAtEnd(int x)
	{   
	   if(head == null){
	       head = new Node(x);
	       return;
	   }
	   Node temp = head;
	   Node n = new Node(x);
	   n.next = null;
	   while(temp.next != null)
	       temp = temp.next;
	   temp.next = n;
	}

    // Please do not delete this
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}