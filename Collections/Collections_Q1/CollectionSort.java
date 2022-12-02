package Collections_Q1;

import java.util.*;

public class CollectionSort {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(23,45,12,4,90,43);
	
	//using Collections.sort method to sort the list
    Collections.sort(list);
	
	System.out.println("sorted integer list: "+list);
	
	
	//sorting object of Student according to roll number
	Student s1 = new Student(12, "john",20);
	Student s2 = new Student(3, "mark",22);
	
	List<Student> student= new ArrayList<>();
	student.add(s1);
	student.add(s2);
	student.add(new Student(6,"Sam",18));
	
	Collections.sort(student, new sortByRollNumber());
	
	Iterator itr = student.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

}

}

class sortByRollNumber implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.roll_number - o2.roll_number;
	}
	
}
