/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n == 1 || n == 2) {//binary decision
          return 1;//basecase solution
        }
        else {
          return fib_recurrence(n-1) + fib_recurrence(n-2);//recursive abstraction
          //includes combining and leftover steps here.
        }
    }
     /* These are class methods because the fib_recurrence method will
     return the same value for the same input regardless of which instance
     of the class it is invoked in, so it would be better to make it a class
     method.
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        long lowerPair = 1;
        long higherPair = 1;
        if (n == 1 || n == 2) return 1;
        else {
          for (int index = 3; index < n; index++) {
            long oldHigherPair = higherPair;
            higherPair += lowerPair;
            lowerPair = oldHigherPair;
          }
        }
        return higherPair + lowerPair;
    }
    /* Time complexity:
       Consider the size of the problem to be ...

       As the proxy for the time required, count...

       Then cost of the the recurrence algorithm
       grows ??
       as the size of the problem increases,
       because ??
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static long fib_Binet( int n) {
        //multiple variables used here to prevent confusion on my part
        double firstVarOnNumerator = Math.pow((1 + Math.sqrt(5)) /2, n);
        double secondVarOnNumerator = Math.pow((1 - Math.sqrt(5)) /2, n);
        double output = (firstVarOnNumerator - secondVarOnNumerator) / Math.sqrt(5);
        return (long) output; //temp until code done
    }
    /* Time complexity:
       Consider the size of the problem to be ...

       As the proxy for the time required, count...

       Then cost of the the recurrence algorithm
       grows ??
       as the size of the problem increases,
       because ??
     */
}
