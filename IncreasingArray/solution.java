import java.io.*;
import java.util.*;

public class solution{
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		// String st = sc.next();

		int n = sc.nextInt();
		int[] arr= new int[n];

		for(int i =0; i<n ;i++){
			arr[i] = sc.nextInt();	
		}


		long step=0;

		for(int i=1; i<n;i++){
			if(arr[i-1]<=arr[i]){
				// skip;
			}
			else if(arr[i-1]>arr[i]){
				step += arr[i-1]-arr[i];
				arr[i] = arr[i-1];
			}
		}
		
		
		System.out.print(step);
	}
}