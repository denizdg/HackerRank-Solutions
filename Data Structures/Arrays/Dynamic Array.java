import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int q = in.nextInt();
		int lastAnswer = 0;

		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();

		// Create n number of array list contains integer array list

		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < q; i++) {
			int type = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();

			int seq = (x ^ lastAnswer) % n;
			// It will get the related list according to set value
			ArrayList<Integer> list = seqList.get(seq);
			
			if (type == 1) {
				list.add(y);
			}
			else{
				lastAnswer = list.get(y % list.size());
				System.out.println(lastAnswer);
			}
        }
    }
}