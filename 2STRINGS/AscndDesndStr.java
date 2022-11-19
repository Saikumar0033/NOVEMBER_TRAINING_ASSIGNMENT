package JavaAssessments.Strings;
import java.util.Arrays;
//WAP to print the all alphabets of string in ascending and descending order
public class AscndDesndStr {
    public static void main(String[] args) {
        orderStr("jason");
    }

    static void orderStr(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println("Ascending order:");
        for(char i:ch){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Descending order:");
        for(int i=ch.length-1 ; i>=0; i--){
            System.out.print(ch[i]+",");
        }
    }
}
