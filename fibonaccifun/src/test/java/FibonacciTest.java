import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

  @ParameterizedTest
  @MethodSource("fibonacciNumbers")
  void fibonacci(int number, int expected) {
    assertEquals(expected, Fibonacci.calculate(number));
  }

  static Stream<Arguments> fibonacciNumbers() {
    return Stream.of(
        Arguments.of(0, 0),
        Arguments.of(1, 1),
        Arguments.of(2, 1),
        Arguments.of(3, 2),
        Arguments.of(4, 3),
        Arguments.of(5, 5),
        Arguments.of(6, 8),
        Arguments.of(7, 13),
        Arguments.of(8, 21),
        Arguments.of(9, 34));
  }
}