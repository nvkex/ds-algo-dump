import java.util.*;

class solve {

    public static int minIndexChar(String str, String pat) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // Add characters of str to map
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == null)
                map.put(c, i);
        }

        // Match characters of pat with map elements
        int min = str.length();
        for (int i = 0; i < pat.length(); i++) {
            Integer ind = map.get(pat.charAt(i));
            if (ind != null) {
                min = min > ind ? ind : min;
            }
        }

        return min == str.length() ? -1 : min;

    }
}

class MinIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            String s1 = sc.next();
            String s2 = sc.next();
            int res = solve.minIndexChar(s1, s2);
            if (res != -1)
                System.out.println(s1.charAt(res));
            else
                System.out.println("No character present");
        }
    }
}