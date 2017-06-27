import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int d = in.nextInt();
		
		int arr[] = new int[n];

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		
		int mode = d % n;
		
		if(mode == 0){
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		else{
			for (int i = 0; i < mode; i++) {
				int temp = arr[0];
				for (int j = 0; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = temp;
			}
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
    }
}