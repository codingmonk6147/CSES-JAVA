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
	   while(n-->0){
	   	  int x = sc.nextInt();
	   	  int y = sc.nextInt();
	   	  System.out.println(findNum(x,y));
	   	  
	   }

		
		
		
		// System.out.print(step);
	}
     

     public static long findNum(int x, int y){
     	if(x==y){
     		long num = ((long) x * (long)(x-1))+1;
     		return num;
     	}

     	else if(x<y){
     		long num = ((long)y * (long)(y-1))+1;
     		if(y%2!=0){
     			num = num + (y-x);
     			
     		}
     		else{
     			num = num - (y-x);
     			
     		}
     		return num;
     	}
     	else if(x>y){
     		long num = ((long)x * (long)(x-1))+1;
     		if(x%2!=0){
     			 num = num + (y-x);
     		
     		}
     		else{
     			num = num - (y-x);
     			
     		}
     		return num;
     	}
     	return 0;
     }

	// TLE --> optimisation required
	// public static long findNum(int x, int y){
	// 	if(x<y){
				
	// 			if(y%2==0){
	// 				long num = (long)y*(long)y;
	// 				while(y>0){
	// 					num--;
	// 					y--;
	// 				}
	// 				while(x>1){
	// 					num--;
	// 					x--;
	// 				}
	// 				return num;
	// 			}
	// 			else{
	// 				long num = (long)y*(long)y;
	// 				while(x>1){
	// 					num--;
	// 					x--;
	// 				}
	// 				return num;
	// 			}
	// 	}
	// 	else if (x>y){
			
	// 		if(x%2==0){
	// 				long num = (long)x*(long)x;
	// 				while(y>1){
	// 					num--;
	// 					y--;
	// 				}
	// 				return num;
	// 		}
	// 		else{
	// 				long num = (long)x*(long)x;
	// 				while(x>0){
	// 					num--;
	// 					x--;
	// 				}
	// 				while(y>0){
	// 						num--;
	// 						y--;
	// 				}
	// 				return num;
	// 		}
	// 	}
	// 	else{
	// 		long num = ((long)x*(long)(x-1))+1;
	// 		return num;
	// 	}
	// }
}