package Collections_Q1;

public class Student {
    int roll_number;
    String name;
    int age;
    
    public Student(int roll_number, String name, int age) {
    	this.roll_number = roll_number;
    	this.name = name;
    	this.age = age;
    }

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", age=" + age + "]";
	}
    
    
}
