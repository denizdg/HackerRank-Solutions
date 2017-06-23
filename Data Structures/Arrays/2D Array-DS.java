import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		int arr[][] = new int[6][6];
		int maxSum = Integer.MIN_VALUE;
		
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length - 2; i++){
        	for (int j = 0; j < arr.length - 2; j++) {
				int sum = arr[j][i] + arr[j][i+1] + arr[j][i+2]
							     + arr[j+1][i+1] +
						 arr[j+2][i] + arr[j+2][i+1] + arr[j+2][i+2];
				
				if(sum > maxSum)
					maxSum = sum;
			}
        }
        
        System.out.println(maxSum);
    }
}