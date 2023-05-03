import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {

    SumCalculator sumCalculator;

    @BeforeEach
    public void init() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumCalculator1() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testSumCalculator6(){
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testSumCalculator0(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));
    }
}