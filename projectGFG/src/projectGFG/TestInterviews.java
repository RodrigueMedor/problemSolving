package projectGFG;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestInterviews {
	
	static boolean check(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		Stack<Character> st = new Stack<>();
		for(int i =0; i < str.length(); i++) {
			char test = str.charAt(i);
			if(map.keySet().contains(test))
				st.push(test);
			else if(map.values().contains(test)) {
					if(!st.empty() && map.get(st.peek()) == test)
						st.pop();
					else
						return false;
				}
		}
		return st.empty();
	}
	public static void main(String[] args) {
		String str = "()[]{}";
	      System.out.println( check(str));
	}

}
