package JavaAssessments.Strings;

// WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
public class StringBufBulspeeds {
    public static void main(String[] args) {
        int limit = 10000;
        StringBuffer sb = new StringBuffer();
        long startTime =  System.currentTimeMillis();
        for(int i=0;i<limit;i++){
            sb.append(i);
        }
        long endTime = System.currentTimeMillis()-startTime;
        System.out.println("Time taken by string buffer to run the loop : "+endTime+" milli seconds");
        StringBuilder sb1 =new StringBuilder();
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<10;i++){
            sb1.append(i);
        }
        long endTime1 = System.currentTimeMillis()-startTime1;
        System.out.println("Time taken by string builder to run the loop : "+endTime1+" milli seconds");
    }
}
