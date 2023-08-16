import org.example.CalculatorSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorSumTest {
    @Test
    void calculatorSumTest() {
        Assertions.assertEquals(11,new CalculatorSum().calculatorSum(10, 1));
    }
}
