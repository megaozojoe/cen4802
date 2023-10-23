/**
 * @author Matthew del Real *
 */
public class main {
  //this is the main class

  /**
   *
   * @param args this is the default main class
   */
  public static void main(String[] args) {
    //main method

    int num = 10; //the number that will be passed

    int fib = recFib(num); //the resulting number with the passed 10
    System.out.println("The "+ num +"th term of the Fibonacci sequence is " + fib); //print result
  }


  //recursive fib sequence
  //then printing results after

  /**
   *
   * @param num this is the number of the fibonacci sequence that is to be created
   * @return returns the nth number of the fibonacci sequence
   */
  public static int recFib(int num){
    if(num == 0)
      return 0;
    else if (num ==1)
      return 1;
    else 
      return recFib(num-1) + recFib(num-2);
    
  }
}