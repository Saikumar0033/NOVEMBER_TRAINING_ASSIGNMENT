package JavaAssessments.ARRAYS;
import java.util.Arrays;

// WAP to sort array on the basis of unit place. For example we are having following numbers:-
//10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9.
public class UnitPlaceSort {
    public static void main(String[] args) {
        int[] a = {10, 2, 3, 41, 12, 13, 19, 81, 9};
        System.out.println(Arrays.toString(sorting(a)));
    }

    static int[] sorting(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 10 > a[j] % 10) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if (a[i] % 10 == a[j] % 10) {
                    if (a[i] >= a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

        }
        return a;
    }
}
