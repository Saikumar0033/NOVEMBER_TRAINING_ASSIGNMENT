package Exception_Q10;

public class Test {

	public static void main(String[] args) {
		int[] arr = {2,1,9,4,6,3};
		Parent p = new Child();
        System.out.println("maximum number: "+p.calculate_maximum(arr));
	}
	    
}

class Parent {
	public int calculate_maximum(int[] arr) {
		int temp = 0;
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
		return temp;
	}
}

class Child extends Parent{
	
	@Override
	public int calculate_maximum(int[] arr) {
		int temp = 0;
		int avg=0;
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		
		for(int i:arr) {
			avg =avg+i;
		}
		System.out.println("average: "+(avg/arr.length));
		return temp;
	}
}
