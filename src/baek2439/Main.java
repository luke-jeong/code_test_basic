package baek2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws IOException{
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       
	       int a = Integer.parseInt(br.readLine());
	       
	      
	       for(int i = 1; i <=a; i++) {
	    	   for(int k = 1; k <= a-i; k++) {
	    	   System.out.print(" ");
	    	   }
	    	   for(int j = 1;j <= i; j++) {
	    	   System.out.print("*");
	    	   }
	       System.out.println();
	       }

	    }
}
