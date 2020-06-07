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
        obj.rearrange();
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

    void rearrange(){
        Node head1 = root;
        Node last = root;
        Node mid = root;
        // Get mid
        while(last != null && last.next != null){
            mid = mid.next;
            last = last.next.next;
        }
        
        // Reverse second half
        Node prev = null; 
        Node current = mid.next; 
        Node next = null; 
        mid.next = null;
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }

        // Merge
        Node temp1,temp2;
        while(prev != null && head1 != null){
            temp1 = head1.next;
            temp2 = prev.next;
            head1.next = prev;
            prev.next = temp1;
            prev = temp2;
            head1 = temp1;
        }
    }

    void display(){
        Node temp = root;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}