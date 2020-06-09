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

class SegregateInput {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i= 0;i<t;i++){
            int n = sc.nextInt();
            Node head = null;
            Node odd = null,
                oddHead=null,
                even = null,
                evenHead=null;

		    for(int j = 0;j<n;j++){
                int dat = sc.nextInt();
                if(dat%2==0){
                    if(even == null){
                        even = new Node(dat);
                        evenHead = even;
                    }
                    else{
                        even.next = new Node(dat);
                        even = even.next;
                    }
                }
                else{
                    if(odd == null){
                        odd = new Node(dat);
                        oddHead = odd;
                    }
                    else{
                        odd.next = new Node(dat);
                        odd = odd.next;
                    }
                }
            }
            if(evenHead != null){
                even.next = oddHead;
		        head = evenHead;
            }
            else
                head = oddHead;
		    while(head != null){
		        System.out.print(head.data+ " ");
		        head = head.next;
		    }
		    System.out.println();
		}
    }
}