package JavaAssessments.ARRAYS;
import java.util.Arrays;

// An Array contain the n numbers you have to find out combination which satisfy Pythagoras
//Template. ( Pythagoras templates:- 3*3+4*4==5*5)
public class PythagorasTemp {
    public static void main(String[] args) {
        int[] a={3,1,4,6,5};
        System.out.println(checkPythagoras(a));
    }

    static String checkPythagoras(int[] b){
        int[] a = b.clone();
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    int x=a[i],y=a[j],z=a[k];
                    if(x+y==z || z+y==x || x+z==y){
                        return "the pythagoras numbers are "+b[i]+", "+b[j]+", "+b[k];
                    }
                }
            }
        }
        return "no pythagoras numbers found";
    }
}
