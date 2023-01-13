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
		int n = sc.nextInt();
		int[] arr = new int[n-1];
		for(int i=0; i<arr.length;i++ ){
			arr[i] = sc.nextInt();
		}


		HashSet<Integer> hs = new HashSet<>();
		for(int num : arr){
			hs.add(num);
		}

		int ans =1;
		while(hs.contains(ans)){
			ans++;
		}
		System.out.print(ans);
		
		// System.out.print(" "+n);
	}
}