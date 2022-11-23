package Oops_Q7;

public class Test extends String_Comparision{
	
	@Override
	public void stringCompare(String str1, String str2) {
		
		int count=0;
		int length=(str1.length()<str2.length()) ? str1.length() : str2.length();
		
		for( int i=0;i<length; i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("Found matchings : "+count);
		}else {
			System.out.println("no matchings found");
		}
	}
	
	public static void main(String[] args) {
		String_Comparision string_comparision = new Test();
		
		string_comparision.stringCompare("Apple", "Apple");
	}

}
