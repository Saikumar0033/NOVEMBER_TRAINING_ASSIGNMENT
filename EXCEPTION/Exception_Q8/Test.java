package Exception_Q8;

/*User will input the password and with the help of your algorithm. You are suppose to test that 
password is strong or not. A password is said to be strong if it is of length in the range of 8 to 14 
and having at least 2 capital letters, 2 small letters, 2 digits and 2 special characters. This is minimum 
requirements for password of length 8 for password of length greater than 8 this should be present 
and other character can be used. If user not entered the password in given format 
PasswordFormatException should be thrown and handled properly.*/

public class Test {

	public static void main(String[] args) throws PasswordFormatException {
		isValid("KKj$$9873l");
	}

	public static void isValid(String password) throws PasswordFormatException {

		String strSpecial = "!@#$%^&*()-_=+:;'.,~|?></{}\"\\[]";
		String strNum = "1234567890";
		String s;
		int specialCount = 0;

		if (!((password.length() >= 8) && (password.length() <= 14))) {
			s = "Password length should be between 8 to 14 characters";
			throw new PasswordFormatException(s);
		}
		if (password.contains(" ")) {
			s = "Password should not contain any space";
			throw new PasswordFormatException(s);
		}

		// checks digits
		if (true) {
			int count = 0;
			for (char c : password.toCharArray()) {
				for (char ch:strNum.toCharArray()) {
					if (c == ch) {
						
						count++;
					}
				}
			}
			if (count < 2) {
				s = "Password should contain atleast two digit(0-9)";
				throw new PasswordFormatException(s);
			}
		}

		for (char c : password.toCharArray()) {
			for (char d : strSpecial.toCharArray())
				if (c == d) {
					specialCount++;
				}
		}
		if (specialCount < 2) {
			s = "Password should contain atleast two special character";
			throw new PasswordFormatException(s);
		}

		if (true) {
			int count = 0;
			for(String s1:password.split("")) {
			// checking capital letters
			for (int i = 65; i <= 90; i++) {
				// type casting
				char c = (char) i;

				String str1 = Character.toString(c);
				if (s1.equals(str1)) {
					count++;
				}
			}
			}
			if (count < 2) {
				s = "Password should contain at" + " two uppercase letter(A-Z)";
				throw new PasswordFormatException(s);
			}
		}
		if (true) {
			int count = 0;
			for(String s1:password.split("")) {
			// checking capital letters
			for (int i = 97; i <= 122; i++) {
				// type casting
				char c = (char) i;

				String str1 = Character.toString(c);
				if (s1.equals(str1)) {
					count++;
				}
			}
			}
			if (count < 2) {
				s = "Password should contain at" + " two lower letter(a-z)";
				throw new PasswordFormatException(s);
			}
		}
		
		System.out.println("Password is satisfying the condition");
		}

	

}
