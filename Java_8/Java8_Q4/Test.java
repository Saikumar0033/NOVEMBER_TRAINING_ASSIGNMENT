package Java8_Q4;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("print ", "word");

		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		System.out.println(sb);
		// System.out.println(sb);
		sb.insert(5, " a");
		// String con = sb.toString();
        
		System.out.println(sb);
		
		System.gc();
		
	}
}