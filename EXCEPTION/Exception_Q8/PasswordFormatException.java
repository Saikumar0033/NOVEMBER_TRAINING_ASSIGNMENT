package Exception_Q8;

public class PasswordFormatException extends Exception{
	
	int passwordConditionViolated = 0;

	public PasswordFormatException(String s) {
		super("Invalid Password: "+s);
	}

}
