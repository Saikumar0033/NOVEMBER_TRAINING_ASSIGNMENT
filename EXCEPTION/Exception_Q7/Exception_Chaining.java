package Exception_Q7;

import java.io.IOException;

public class Exception_Chaining
{
    public static void divide(int a, int b)
    {
      if(b == 0)
      {
        ArithmeticException ae = new ArithmeticException("Exception");
        ae.initCause(new IOException("cause for this exception"));
        throw ae;
      }
      else
      {
        System.out.println(a/b);
      }
    }

    public static void main(String[] args)
    {
      try 
      {
        divide(5, 0);
      }
      catch(ArithmeticException ae) {
        System.out.println( "Exception : " +ae);
        System.out.println("actual cause of exception: "+ae.getCause());
      }
    }
}

