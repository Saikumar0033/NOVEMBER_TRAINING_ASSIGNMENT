package Java8_Q1;

/* WAP to check the given no is palindrome or not. Don’t use divide 
method. */

public class Palindome {
	public static void main(String[] args) {
		
		//using lambda expression written the logic to check palindrome of given number
		Reverse r =(n)->{
			String s = String.valueOf(n);
			String res = "";
		    for(char i:s.toCharArray()) {
		    	res = i+res;
		    }
		    if(res.equalsIgnoreCase(s)) {
		    	return "palindrome";
		    }
		    return "not palindrome";
		};
			System.out.println(r.checkReverse(101));
	}
}

//Functional Interface
interface Reverse{
	abstract public String checkReverse(int n);
}
