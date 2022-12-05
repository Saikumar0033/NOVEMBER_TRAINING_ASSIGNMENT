package Collections_Q7;

import java.util.Comparator;

public class Sort_By_Name implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSname().charAt(0) > o2.getSname().charAt(0))
			return 1;
		else if(o1.getSname().charAt(0)==o2.getSname().charAt(0))
			return 0;
		else
			return -1;
	
	}

}
