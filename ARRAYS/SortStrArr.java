package JavaAssessments.ARRAYS;
import java.util.Arrays;

/*You are having array of strings. Now you have to arrange strings in array on the basis of the
length of each string. Smallest string will be first and so on.*/
public class SortStrArr {
    public static void main(String[] args) {
        String[] a = {"apple","mango","grapes","goa","12"};
        System.out.println(Arrays.toString(sortStringarr(a)));
    }

    static String[] sortStringarr(String[] a){
        for(int i=0;i<a.length;i++){
            String temp;
            for(int j=i+1;j<a.length;j++){
                if(a[i].length()>a[j].length()){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
