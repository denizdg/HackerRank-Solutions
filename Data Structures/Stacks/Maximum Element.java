import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> maxStack = new Stack<Integer>(); 
		
		for (int i = 0; i < n; i++) {
			
			int type = in.nextInt();
			int number = 0;
			
			if(type == 1){
				number = in.nextInt();
				stack.push(number);
				
				if(maxStack.isEmpty())
					maxStack.push(number);
				else{
					if(maxStack.peek() > number)
						maxStack.push(maxStack.peek());
					else
						maxStack.push(number);
				}
			}
			
			else if(type == 2){
				stack.pop();
				maxStack.pop();
			}
			
			else{
				
				System.out.println(maxStack.peek());
			}
			
		}
    }
}