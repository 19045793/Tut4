package Tutorial4;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc {
  @Test
  void testAdd() {
        Calc testCalc = new Calc();
        assertEquals(9, testCalc.add(4, 5));
    }


}