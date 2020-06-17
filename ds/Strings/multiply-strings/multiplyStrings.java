import java.util.*;
import java.math.*;


// Driver Code
class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            Sol g = new Sol();
            System.out.println(g.multiply(a, b));
        }
    }
}

// My Code

class Sol {
    public String multiply(String a, String b) {
        return new BigInteger(a).multiply(new BigInteger(b)).toString();
    }
}