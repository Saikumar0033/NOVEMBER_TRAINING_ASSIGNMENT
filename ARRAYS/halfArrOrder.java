package JavaAssessments.ARRAYS;
import java.util.Arrays;

/*Suppose that you are having an array of size N. now your task is to sort the half array that is
from 0 to N/2 in ascending order and N/2+1 to N in descending order. */
public class halfArrOrder {
    public static void main(String[] args) {
        int[] a={3,1,8,7,9,4};
        System.out.println(Arrays.toString(halfOrder(a)));
    }

    static int[] halfOrder(int[] a){
        int size = a.length, temp;
        //first half ascending
        for(int i=0;i<size/2;i++){
            for(int j=i+1;j<size/2;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //second half descending
        for(int i=size/2;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
