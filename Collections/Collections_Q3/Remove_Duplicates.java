package Collections_Q3;
import java.util.*;


/*WAP to store elements in List and remove all duplicates value from it. (Numbers 
should be inserted). When duplicates are removed print all elements in ascending 
order*/
public class Remove_Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you want to store: ");
		int count = sc.nextInt();
		int i=0;
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Numbers");
		while(i<count) {
			list.add(sc.nextInt());
			i++;
		}
		System.out.println("List after removing duplicates: "+removeDup(list));
		removeDup_Set(list);
	}
	
	//without using set 
	static List<Integer> removeDup(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int k=i+1;k<list.size();k++) {
				if(list.get(i)==list.get(k)) {
					list.remove(k);
				}
			}
		}
		Collections.sort(list);
		return list;
	}
	
	//using set
	static void removeDup_Set(List<Integer> list) {
		Set<Integer> set = new TreeSet<>(list);
		System.out.println(set);
		
	}
}
