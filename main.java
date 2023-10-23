class Main {
  public static void main(String[] args) {

    int num = 10;

    int fib = recFib(num);
    System.out.println("The "+ num +"th term of the Fibonacci sequence is " + fib);
  }


  //recursive fib sequence
  //then printing results after
  public static int recFib(int num){
    if(num == 0)
      return 0;
    else if (num ==1)
      return 1;
    else 
      return recFib(num-1) + recFib(num-2);
    
  }
}