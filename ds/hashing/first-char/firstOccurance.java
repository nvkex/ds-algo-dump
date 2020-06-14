
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String patt = br.readLine();
            System.out.println(PrintString.printMinIndexChar(str, patt));
        }
    }
}

class PrintString {

    // Function to find the character in patt which is present in str at min index
    public static StringBuffer printMinIndexChar(String str, String patt) {

        // Hash str
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < patt.length(); i++)
            set.add(patt.charAt(i));

        // Match characters
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i)))
                return new StringBuffer("" + str.charAt(i));
        }

        return new StringBuffer("$");
    }

}
