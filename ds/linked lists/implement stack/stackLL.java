import java.util.Scanner;

class StackNode {
    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
        sc.close();
    }
}

class MyStack {

    StackNode top;

    void push(int a) {
        if (top == null)
            top = new StackNode(a);
        else {
            StackNode temp = new StackNode(a);
            temp.next = top;
            top = temp;
        }
    }

    int pop() {
        int temp = -1;
        if (top != null) {
            temp = top.data;
            top = top.next;
        }
        return temp;
    }
}