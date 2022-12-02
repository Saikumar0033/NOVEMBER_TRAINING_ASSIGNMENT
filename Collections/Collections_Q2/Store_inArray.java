package Collections_Q2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Store_inArray {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,4,1,56,8,90,43);
		
		int arr[] = new int[list.size()];
		
		Collections.sort(list);
	     	for(int i=0;i<arr.length;i++) {
	     		arr[i] = list.get(i);
	     	}
	     	System.out.println(Arrays.toString(arr));
	     	binarySearch(arr, 0, 7,56);
	}
	
	static void binarySearch(int[] arr,int first, int last, int key ) {
		int mid = (first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first = mid + 1;
			}
			else if(arr[mid]==key) {
				System.out.println("Element found at index: "+mid);
				break;
			}else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
	}
}
