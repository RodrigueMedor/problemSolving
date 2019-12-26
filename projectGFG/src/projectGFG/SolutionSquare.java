package projectGFG;

import java.util.Arrays;
import java.util.HashSet;


public class SolutionSquare {
	
	
	static public boolean isValidSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		
		HashSet<Integer> hash = new HashSet<>(Arrays.asList(distance(p1, p2), distance(p1, p3), distance(p1, p4), distance(p2, p3),  distance(p2, p4), distance(p3, p4)));
		
		return !hash.contains(0) && hash.size()  == 2;
	}
	

	static private int distance(int[] a, int[] b) {
		
		return  (a[0]- b[0]) * (a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
	}
	
	public static void main(String[] args) {
		 int[] p1 = {0,0};
		 int[] p2 = {1,1};
		 int[] p3 = {1,0};
		 int[] p4 = {0,1};
					 System.out.println(isValidSquare(p1, p2, p3, p4)==true ? "Yes" : "No"); 
	}
}
