package projectGFG;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1Array {
	
	static public int[] printList(int[] arr) {
		int len = arr.length;
		int[] ans = new int[len];
		for(int i =0, temp =1; i < len; i++) {
			ans[i] = temp;
			temp*= arr[i];
		}
		for(int i = len - 1,temp = 1; i >= 0;i--) {
			ans[i] *= temp;
			temp *= arr[i];
		}
		return ans; 
	}
	
	public static void main(String[] args) {
		int sum = IntStream.range(20, 8).reduce(0, Integer::sum);
		System.out.println(sum);
		
		int[] arr= {1,2,3,4};
        int[] nums = {1,2,3,4,5,6};
        int[] yy = printList(nums);
        for(int t : yy)
            System.out.print(t+" ");
        
        int u[] ={10,2};
        //convertArrayToString(u);
	}

	
	  public static String convertArrayToString(String[] strArray) {
	        return Arrays.toString(strArray);
	    }

}
