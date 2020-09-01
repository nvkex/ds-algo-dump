import java.io.*;
import java.util.*;

class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++){
            String sub = str.substring(i,i+1);
            if(s1.contains(sub) && s2.contains(sub))
                return "YES";
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
