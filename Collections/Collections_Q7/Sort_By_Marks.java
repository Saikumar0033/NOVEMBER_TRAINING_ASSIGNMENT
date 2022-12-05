package Collections_Q7;

import java.util.Comparator;

public class Sort_By_Marks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getTotalmarks() > o2.getTotalmarks())
			return -1;
		else if(o1.getTotalmarks() == o2.getTotalmarks())
			return 0;
		else
			return 1;
	}

}
