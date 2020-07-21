/**
*	Check for balanced parantheses
**/

import java.util.*;


// Write your code here. DO NOT use an access modifier in your class declaration.
 class Parser{
     static Boolean isBalanced(String expr){
        Deque<Character> stack = new ArrayDeque<Character>(); 

        for (int i = 0; i < expr.length(); i++) { 
            char x = expr.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{') { 
                stack.push(x); 
                continue; 
            } 

            if (stack.isEmpty()) 
                return false; 
  
            switch (x) { 
            case ')':
                if(stack.element() != '(') 
                    return false;
                stack.pop(); 
                break; 
  
            case '}': 
                if(stack.element() != '{') 
                    return false;
                stack.pop(); 
                break; 
  
            case ']': 
                if(stack.element() != '[') 
                    return false;
                stack.pop();
                break; 
            } 
        } 
        return (stack.isEmpty()); 
    } 
}
 

class Solution {
    public static void Main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Expression: ");
        String exp = sc.next();
        System.out.print(Parser.isBalanced(exp));
        sc.close();
    }
}