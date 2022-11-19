package JavaAssessments.ARRAYS;

//An Array Contain different numbers you have to find how many are even, odd, perfect and prime
public class FindTypes {
    public static void main(String[] args) {
        int[] a={9,2,8,4,5,1,6};
        findType(a);
    }


    static void findType(int[] a){
        int even=0, odd=0, prime=0, perfect=0;
        for(int i:a){
            if(i%2==0){
                even++;
                if(prime(i)){
                    prime++;
                }else if(perfect(i)){
                    perfect++;
                }
            }else{
                odd++;
                if(prime(i)){
                    prime++;
                }else if(perfect(i)){
                    perfect++;
                }
            }
        }
        System.out.println("count of numbers which are even="+even+", odd="+odd+", prime="+prime+", perfect="+perfect);
    }

    static boolean prime(int n){
        if(n==1 || n==2){
            return true;
        }else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean perfect(int n){
        int test=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                test = test+i;
                //System.out.println(test);
            }
        }
        if(test==n){
            return true;
        }
        return false;
    }
}
