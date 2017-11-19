/**
 * Created by margarita on 19/11/17.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HomeWorkTests {

  @Test
  public void shouldSummarizeNumbers1() {
    int result = HomeWork.SumOfNumbers(123543);

    assertEquals(18, result);
  }

  @Test
  public void shouldSummarizeNumbers2() {
    int result = HomeWork.SumOfNumbers(29078465);

    assertEquals(41, result);
  }

  @Test
  public void shouldSummarizeNumbers3() {
    int result = HomeWork.SumOfNumbers(78493845);

    assertEquals(48, result);
  }

  @Test
  public void shouldFindFactorialOfNumbers1() {
    int result = HomeWork.FactorialOfNum(5);

    assertEquals(120, result);
  }

  @Test
  public void shouldFindFactorialOfNumbers2() {
    int result = HomeWork.FactorialOfNum(3);

    assertEquals(6, result);
  }

  @Test
  public void shouldFindFactorialOfNumbers3() {
    int result = HomeWork.FactorialOfNum(10);

    assertEquals(3628800, result);
  }

  @Test
  public void shouldFindTriangleCalculation1() {
    int result = HomeWork.triangleCalculation(5, "perimeter");

    assertEquals(20, result);
  }

  @Test
  public void shouldFindTriangleCalculation2() {
    int result = HomeWork.triangleCalculation(6, "square");

    assertEquals(36, result);
  }

  @Test
  public void shouldFindTriangleCalculation3() {
    int result = HomeWork.triangleCalculation(6, "zero");

    assertEquals(0, result);
  }

}