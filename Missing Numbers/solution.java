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

		HashSet<Character> hs = new HashSet<>();
		int ans=0;
		while(j<st.length()){
			if(hs.contains(st.charAt(j))){
				ans = Math.max(ans,j-i+1);
				i=++j;
			}else{
				hs.add(st.charAt(j));
			}
			j++;
		}
		
		
		System.out.print(ans);
	}
}