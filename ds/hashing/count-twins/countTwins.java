
import java.util.*;

class CountTwins {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int count;
		while(t-->0){
		    count = 0;
		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		    int n = sc.nextInt();
		    int a;
		    Integer c;
		    for(int i=0; i<n; i++){
		        a = sc.nextInt();
                c = map.get(a);
                // Check if doesnt exist, then add
		        if(c==null){
		            c=1;
		            map.put(a,c);
                }
                // If exists increase counter
		        else{
		            map.put(a,++c);
		        }
		        
		        // Count Pairs
		        if(c%2==0)
		            count=count+2;
		    }
		    System.out.println(count);
        }
        sc.close();
	}
}