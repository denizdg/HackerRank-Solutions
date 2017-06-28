import java.io.*;
import java.util.*;

// Algotithm explanation is here: 
// https://codingin.wordpress.com/2017/02/19/solution-algorithmic-crush-in-java/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		long sum = 0;
		long max = 0;
		
		long[] arr = new long[n + 1];
	
		
		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			long k = in.nextLong();
			
			arr[a] += k;
			
			if((b + 1) <= n)
				arr[b + 1] -= k;
		}
		
		for (long l : arr) {
			sum += l;
			if(sum > max)
				max = sum;
		}
		
		System.out.println(max);
	}
}