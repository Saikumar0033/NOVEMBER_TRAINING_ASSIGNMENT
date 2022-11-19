package JavaAssessments.Strings;
import java.util.Scanner;

// 1) Create a program in which two string is input by the user and after that user will enter index in
//first string where we want to insert the second string and insert the second string at that index
//and create a new string
public class StringMerge {
    public static void main(String[] args) {
        System.out.print("Enter the first string : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.print("Enter the second string : ");
        String s2 = sc.next();
        //char[] ch = s1.toCharArray();
        while(true) {
            System.out.print("Enter the index : ");
            int index = sc.nextInt();
            try {
                String result = s1.substring(0, index) + s2 + s1.substring(index, s1.length());
                System.out.println(result);
                break;
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
