// My Code
import java.util.*;

public class StackAsQueue {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        Stack<Integer> cpy = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            if(q == 1){
                int n = sc.nextInt();
                stk.push(n);
            }
            else {
                if(cpy.empty()){
                    while(!stk.empty())
                        cpy.push(stk.pop());
                }
                if(!cpy.empty()){
                    if(q==2)
                        cpy.pop();
                    else if(q==3)
                        System.out.println(cpy.peek());
                }
            }
        }

        sc.close();
    }
}