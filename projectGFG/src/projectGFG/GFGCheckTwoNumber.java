package projectGFG;

import java.util.HashSet;

public class GFGCheckTwoNumber {
	
	
	static boolean checkPair(int[] arr, int n) {
		int sum  =0;
		for(int i =0; i < n; i++) {
			sum +=arr[i];
		}
		
		
		if(sum % 2 != 0)
			return false;
		
		sum =  sum /2;
		
		HashSet<Integer> set = new HashSet<>();
		for(int i =0; i < n; i++) {
			int val = sum - arr[i];
			if(set.contains(val) && val ==(int) set.toArray()[set.size()-1]) {
				System.out.printf("%d  %d", val, arr[i]);
				
				return true;
			}
			
			set.add(arr[i]);
		}
		return false;
	}
	
	public static void main(String[] args) {
		  int arr[] = {2, 11, 5, 1, 4, 7};
	        int n = arr.length;
	        if (checkPair(arr, n) == false)
	        {
	            System.out.printf("No pair found");
	        }
	}

}
