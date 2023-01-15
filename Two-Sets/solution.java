import java.io.*;
import java.util.*;

public class solution{
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		// Scanner sc = new Scanner(System.in);
		// String st = sc.next();
		FastReader sc = new FastReader();
		int n = sc.nextInt();
	    int[] arr= new int[n];
	    for(int i =0; i<n;i++){
	    	arr[i] = i+1;
	    }
	  long sum = ((long)n*(long)(n+1)/2);
	  if( (sum/2)%2==0){
	  			ArrayList<Integer> s1 = new ArrayList<Integer>();
	  			ArrayList<Integer> s2 = new ArrayList<Integer>();
	  			boolean[] visited = new boolean[n];
	  			long divSum =sum/2;

	  				for(int i=n-1 ;i>=0;i--){

	  					if(divSum>=(long)arr[i]){
	  						s1.add(arr[i]);
	  					    visited[i] = true;
	  					    divSum -= arr[i];
	  					}
	  					
	  				}

	  				for(int i=0;i<n;i++){
	  					if(visited[i]==false){
	  						s2.add(arr[i]);
	  					}
	  				}
	  				System.out.println(s1.size());
	  				for(int k : s1 ){
	  					System.out.print(k+" ");
	  				}
	  				System.out.println();
	  				System.out.println(s2.size());
	  				for(int k : s2 ){
	  					System.out.print(k+" ");
	  				}
	  }
	  else{
	  	System.out.println("NO");
	  }
       
		
		
		
		// System.out.print(step);
	}
     
   


}