/**
 * Created by margarita on 19/11/17.
 */
public class HomeWork {

  public static int SumOfNumbers(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num = num / 10;
    }
    return sum;
  }
    public static int FactorialOfNum(int num) {
      int res = 1;
      for (int i = 2; i <= num; i++) {
        res *= i;
      }
      return res;
    }
    public static int triangleCalculation(int side, String formula) {
    switch (formula) {
      case "square":
        return side * side;
      case "perimeter":
        return side * 4;
      default:
        return 0;
    }
    }
}
