package Java8_Q2;

import java.util.Arrays;

/*WAP to check the given sequence of character in given string. Suppose 
that you are given following string “Taj is situated in Agra.” And you 
have to find following sequence AST. AST should be one after another. If 
you found sta, or tas, or tsa it should print string not found.*/
public class FindWord {
	
	public static void main(String[] args) {
		String str = "taj is situated in Agra";
		String word = "ast";
		Match findword = (s, w)->{
			if(s.contains(w)) {
				return true;
			}
			return false;
		};
		Boolean result = findword.findWord(str, word);
		
		if(result) {
			System.out.println("String Found");
		}else {
			System.out.println("String not found");
		}
		
		
	}

}

//functional interface
interface Match{
	abstract public boolean findWord(String str, String word);
}
