import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		ArrayList<String> nList = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			nList.add(in.next());
		}
		
		int q = in.nextInt();

		Hashtable<String, Integer> qTable = new Hashtable<String, Integer>();		

		for (int i = 0; i < q; i++) {
			String s = in.next();
            
			int count = 0;
			
			if(nList.contains(s)){
				count = Collections.frequency(nList, s);
				qTable.put(s, count);
			}
			
			else{
				qTable.put(s, 0);
			}
		
			System.out.println(qTable.get(s));
			
			
		}
    }
}