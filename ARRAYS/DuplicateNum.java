package JavaAssessments.ARRAYS;
import java.util.*;

//WAP to find duplicate numbers and there counting from list of numbers
public class DuplicateNum {
    public static void main(String[] args) {
         int[] a = {3,9,0,2,3,2,9,9};
         duplicateNum(a);
    }

    static void duplicateNum(int[] a){
       Set<Integer> s =new HashSet<>();
       for(int i:a){
           s.add(i);
       }
       for(int i:s){
           int count = 0;
           for(int j=0;j<a.length;j++){
               if(i==a[j]){
                   count++;
               }
           }
          if(count>1){
              System.out.println("The duplicate element is "+i+" count is "+count);
          }
       }
    }
}
