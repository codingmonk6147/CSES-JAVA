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
		String st = sc.next();

		int i=0;
		int j = 0;

		
		int ans=0;
		while(j<st.length()){
			/*increase j until match is found*/
			if(st.charAt(i)==st.charAt(j)){

				j++;
			}
			/*if match not found --> cal ans --> make i =j -->incre j*/
			else if(st.charAt(i)!=st.charAt(j)){
				ans = Math.max(ans,j-i);
				i=j;
				j++;
			}
			
			
		}
		/*to handle the testcase when j == s.length() */
		ans = Math.max(ans,j-i);
		
		
		System.out.print(ans);
	}
}