package JavaAssessments.Strings;

// WAP to remove all the vowels from the given string.
public class RemoveVowls {
    public static void main(String[] args) {
        System.out.println(removeVols("jasonsaile"));
    }

    static String removeVols(String s){
        String vowels = "aeiouAEIOU", result="";
        String[] a=s.split("");
        for(int i=0;i<s.length();i++) {
            if (vowels.contains(a[i])) {
                   continue;
            }
            result = result+a[i];
        }
        return result;
    }
}
