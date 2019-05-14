/**
  test Fib methods, in response to command line input

  java UserOfFib @method @index
  where @method is one of
      recurrence
      grade8
      Binet
   and @index is the index of the desired Fibonacci number

   For example
          java UserOfFib recurrence 7
    should produce 13
 */

public class UserOfFib {
    public static void main(String[] commandLine) {

        String method = commandLine[0];
        int seek = Integer.valueOf( commandLine[1]);

        System.out.println( "using method " + method
                          + " seeking F_" + seek);

        if(  method.equals( "recurrence"))
            System.out.println( "Fib " + callRecurrence( seek));
        else if( method.equals( "grade8" ))
            System.out.println( "Fib " + callGrade8( seek));
        else if( method.equals( "Binet"))
            System.out.println( "Fib " + callBinet( seek));

        else System.out.println(  "invalid method on the command line");
    }
    public static long callRecurrence(int seek) {
      return Fib.fib_recurrence(seek);
    }
    public static long callGrade8(int seek) {
      return Fib.fib_grade8(seek);
    }
    public static double callBinet(int seek) {
      return Fib.fib_Binet(seek);
    }
}
