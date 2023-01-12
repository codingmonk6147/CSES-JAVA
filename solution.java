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
		long n = sc.nextLong();
		System.out.print(n);
		while(n!=1){
			if(n%2==0){
				n=n/2;
				System.out.print(" "+n);
			}else{
				n = n*3 + 1;
				System.out.print(" "+n);
			}
		}
		// System.out.print(" "+n);
	}
}