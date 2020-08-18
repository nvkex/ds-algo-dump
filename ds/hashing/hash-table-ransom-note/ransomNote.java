import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap <String, Integer>mapMag = new HashMap<String,Integer>();
        HashMap <String, Integer>mapNote = new HashMap<String,Integer>();
        int i =0;
        while(i<magazine.length){
                if(mapMag.get(magazine[i])!=null){
                    mapMag.put(magazine[i], mapMag.get(magazine[i])+1);
                }
                else{
                    mapMag.put(magazine[i], 1);
                }
                i++;
        }
        i=0;
        while(i<note.length){
                if(mapNote.get(note[i])!=null){
                    mapNote.put(note[i], mapNote.get(note[i])+1);
                }
                else{
                    mapNote.put(note[i], 1);
                }
            i++;
        }
        for(Map.Entry<String, Integer> m:mapNote.entrySet()){
            if(mapMag.get(m.getKey()) == null || mapMag.get(m.getKey()) < m.getValue() ){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
