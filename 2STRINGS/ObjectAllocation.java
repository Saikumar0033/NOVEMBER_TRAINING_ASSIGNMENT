package JavaAssessments.Strings;

//WAP to demonstrate how memory is allocated to string objects in memory heap and string 
//constant pool.
public class ObjectAllocation {
    public static void main(String[] args) {

        //when a string object is created using new keyword-- the value is stored in Heap Memory
        //When a String object is created as string literal-- the value is stored in String Constant Pool
        String s = new String("java"); //as a string object
        String  s1 = "java"; //string literal

        //return false-- because string "s" object value will be stored in heap memory as it is created
        // using new keyword and "s1" is a string literal so its value is stored in stringconstantpool
        System.out.println(s==s1);

        //return true-- because "s1" and "s2" are string literals and values are same. when s1 is created
        //already java value is stored in scp and when s1 is created with the same value, s2 holds the same reference.
        String s2 = "java";
        System.out.println(s1==s2);

        //using intern() method the string object value will be stored in String Constant pool. If the
        // value is already present in SCP, then it will hold that value reference
        String sample1="sample";
        String sample = new String("sample").intern();

        //return true as the "sample" is already present in scp.
        System.out.println(sample==sample1);
    }
}
