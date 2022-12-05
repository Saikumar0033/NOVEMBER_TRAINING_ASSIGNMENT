package Collections_Q7;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(101, "John","9th", 445), new Student(102, "Adam", "7th", 240),
				new Student(103, "Akash","10th", 470), new Student(104, "Nithin", "8th", 375), new Student(105, "Sam", "9th", 275), new Student(106, "Akhil", "9th", 150));
		
		Collections.sort(studentList, new Sort_By_Marks());
		
		//Print the name of students who secure first, second and third position.
		System.out.println("---------Students who secured first, second and third position----------");
		int rank=1;
		for(Student i: studentList) {
			System.out.println(i.getSname()+" secured rank "+rank);
			rank++;
			if(rank==4) {
				break;
			}
		}
		
		//Print name of those students who’s marks are below 50%.
		System.out.println("\n--------Students who's marks are below 50%----------");
		for(Student i : studentList) {
			double percentage = (i.getTotalmarks()/5);
			//System.out.println(percentage);
			if(percentage<50) {
				System.out.println(i.getSname());
			}
		}
		
		// Print name of those students who’s marks are below 35% it means they are fail.
		System.out.println("\n---------Students who are failed in exam----------");
		for(Student i : studentList) {
			double percentage = (i.getTotalmarks()/5);
			//System.out.println(percentage);
			if(percentage<35) {
				System.out.println(i.getSname());
			}
		}
		
		//Print name of those students who’s marks are above average score.
		System.out.println("\n---------Students who scored above average----------");
		for(Student i : studentList) {
			double percentage = (i.getTotalmarks()/5);
			//System.out.println(percentage);
			if(percentage>35) {
				System.out.println(i.getSname());
			}
		}
		
		// Print detail of all students on the basis of Name
		System.out.println("\n---------Students----------");
		Collections.sort(studentList, new Sort_By_Name());
		for(Student i: studentList) {
			System.out.println(i);
		}
	}
	
}


