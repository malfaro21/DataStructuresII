public class Fibonacci {

  public static int calculate(int number) {
    if (number == 0) {
      return 0;
    } else if (number == 1) {
      return 1;
    } else {
      return calculate(number - 1) + calculate(number - 2);
    }
  }
}