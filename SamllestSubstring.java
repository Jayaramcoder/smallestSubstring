package arraysprac;

import java.util.HashMap;
import java.util.Scanner;

class SamllestSubstring
{
	
		public static void main (String[] args)
		 {
		     	Scanner sc = new Scanner(System.in);
		     	String str =sc.next();
		         HashMap<Character,Integer> hm = new HashMap<>();
		         int ans = Integer.MAX_VALUE;
		         int n = str.length();
		         
		         for(int i=0;i<n;i++)
		         {
		            char c = str.charAt(i);
		            hm.put(c,Integer.MAX_VALUE);
		         }
		         int diff = hm.keySet().size();
		         
		         for(int i=0;i<n;i++)
		         {
		             char c = str.charAt(i);
		             hm.put(c,i);
		             int temp = get_length(hm, diff);
		             ans = temp < ans ? temp : ans;
		         }
		         System.out.println(ans);
		     }
		 
		 
		 public static int get_length(HashMap<Character,Integer> hm, int diff){
		     int min = Integer.MAX_VALUE;
		     int max = Integer.MIN_VALUE;
		     
		     for(char c: hm.keySet()){
		         int v = hm.get(c);
		         min = v < min ? v : min;
		         max = v > max ? v : max;
		     }
		     
		     if(max == Integer.MAX_VALUE){
		         return Integer.MAX_VALUE;
		     }
		     return (max - min  + 1);
		 }
	}


