package JavaAssessments.Strings;
import java.util.*;
import java.util.stream.Collectors;

//WAP to print the number of alphabets repeated in the given string
public class AlphabetCount {
    public static void main(String[] args) {
        String s="this is an example code";
        countAplabet(s);

    }

    static void countAplabet(String s){
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        //System.out.println(set);
        for(char i:set){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(i==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(i+" : "+count);
        }
    }
}
