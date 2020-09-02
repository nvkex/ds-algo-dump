import java.io.*;
import java.util.*;

public class BalancedBrackets {

    /**
     * 
     * My Code
     * 
     */
    static String isBalanced(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(char c:s.toCharArray()){
                switch(c){
                    case '{':
                    case '[':
                    case '(':
                        stk.push(c);
                        break;
                    case '}':
                        if(stk.empty() || stk.peek() != '{')
                            return "NO";
                        stk.pop();
                        break;
                    case ']':
                        if(stk.empty() || stk.peek() != '[')
                            return "NO";
                        stk.pop();
                        break;
                    case ')':
                        if(stk.empty() || stk.peek() != '(')
                            return "NO";
                        stk.pop();
                        break;
                }
            
        }
        return stk.empty()?"YES":"NO";
    }

    // END

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
