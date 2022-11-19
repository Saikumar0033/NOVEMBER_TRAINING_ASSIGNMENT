package JavaAssessments.ARRAYS;
import java.util.Arrays;

//WAP to find third maximum number from list of numbers.
public class ThirdHighestValue {
    public static void main(String[] args) {
        int[] a = {11,1,0,8,4,32,9,11};
        System.out.println(thirdMaxNum(a));
        System.out.println(usignArrays(a));
    }
    static int thirdMaxNum(int[] a){
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
        return a[a.length-3];
    }

    //using sort method in java.util.Arrays class
    static int usignArrays(int[] a){
        Arrays.sort(a);
        return a[a.length-3];
    }
}
