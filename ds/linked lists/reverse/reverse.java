/**
 * Complexity: O(n)
 */
import java.util.Scanner;

class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Reverse{
    Node root;
    public static void main(String args[]){
        Reverse obj = new Reverse();
        obj.input();
        obj.reverse();
        obj.display();
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int n = sc.nextInt();
        root = new Node(sc.nextInt());
        Node ptr = root;
        Node temp;
        for(int i=0; i<n-1; i++){
            temp = new Node(sc.nextInt());
            ptr.next = temp;
            ptr = ptr.next;
        }
    }

    void reverse(){
        Node current = root;
        Node prev = current;
        Node nxt = current.next;
        current.next = null;
        while(current != null){
            current = nxt;
            nxt = nxt.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        root = prev;
    }

    void display(){
        Node temp = root;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}