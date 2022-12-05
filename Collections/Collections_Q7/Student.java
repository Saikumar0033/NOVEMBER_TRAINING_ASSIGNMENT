package Collections_Q7;

public class Student {
    private int rollno;
    private String sname;
    private String classname;
    private int totalmarks;
    
    public Student(int rollno, String sname, String classname, int totalmarks) {
    	this.rollno = rollno;
    	this.sname = sname;
    	this.classname = classname;
    	this.totalmarks = totalmarks;
    }

	public int getRollno() {
		return rollno;
	}

	public String getSname() {
		return sname;
	}

	public String getClassname() {
		return classname;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
    
    
}
