/*package whatever //do not write package name here */

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i= 0;i<t;i++){
		    int n = sc.nextInt();
		    Node head = new Node(sc.nextInt());
		    Node temp = head;
		    for(int j = 0;j<n-1;j++){
		        temp.next = new Node(sc.nextInt());
		        temp = temp.next;
		    }
		    GFG gfg = new GFG();
		    Node head2 = gfg.segregate(head);
		    while(head2 != null){
		        System.out.print(head2.data+ " ");
		        head2 = head2.next;
		    }
		    System.out.println();
		}
	}
	
	Node segregate(Node head){
	    Node temp = head;
	    Node slow = head;
	    int flag = 0;
	    if(slow.data%2 != 0){
	        slow = new Node(0);
	        slow.next = head;
	        flag = 1;
	    }
	    Node node = slow;
	    while(temp != null && temp.next != null){
	        if(temp.next.data%2 == 0){
	            if(slow == temp){
	                slow = slow.next;
	                temp = temp.next;
	            }
	            else{
	                Node tmp = new Node(temp.next.data);
	                Node tmp2 = temp.next.next;
	                temp.next = tmp2;
	                tmp2 = slow.next;
	                slow.next = tmp;
	                tmp.next = tmp2;
	                slow = slow.next;
	            }
	        }
	        else
	            temp = temp.next;
	    }
	    return flag==0?node:node.next;
	}
}