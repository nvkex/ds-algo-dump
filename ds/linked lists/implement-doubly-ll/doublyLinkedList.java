import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node previous;

    Node(int data){
        this.data = data;
        next = null;
        previous = null;
    }
}

class DoublyLinkedList{

    Node head;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.print("Enter Size: ");
        int SIZE = sc.nextInt();
        System.out.println("Enter data:");
        for(int i=1;i<=SIZE;i++){
            int data = sc.nextInt();
            dll.push(data);
        }
        while(dll.head != null){
            System.out.print(dll.head.data+" ");
            dll.head = dll.head.next;
        }
        sc.close();
    }

    void push(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.previous = temp;
    }
}