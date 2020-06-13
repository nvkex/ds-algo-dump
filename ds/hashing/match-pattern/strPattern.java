import java.util.*;

class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            ArrayList<String> s = new ArrayList<String>(n);
            for (int i = 0; i < n; i++) {
                s.add(sc.next());
            }
            String tt;
            tt = sc.next();
            ArrayList<String> res = Pattern.findMatchedWords(s, tt);
            Collections.sort(res);
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}

class Pattern {
    /*
     * The function returns an array of strings present in the dictionary which
     * matches the string pattern.
     */
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern) {
        ArrayList<String> res = new ArrayList<String>();

        for (String str : dict) {
            int flag = 1;
            HashMap<Character, Character> map = new HashMap<Character, Character>();
            for (int i = 0; i < pattern.length(); i++) {
                if (str.length() != pattern.length()) {
                    flag = 0;
                    break;
                }

                if (map.get(pattern.charAt(i)) == null) {
                    map.put(pattern.charAt(i), str.charAt(i));
                } else {
                    if (map.get(pattern.charAt(i)) != str.charAt(i)) {
                        flag = 0;
                        break;
                    }

                }
            }

            if (flag == 1) {
                res.add(str);
            }
        }

        return res;
    }
}