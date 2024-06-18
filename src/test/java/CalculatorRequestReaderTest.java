import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorRequestReaderTest {

    @Test
    void testInput() {
        CalculatorRequestReader reader = new CalculatorRequestReader();
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculatorRequest result = reader.readRequest();

        assertThat(result.getNum1()).isEqualTo(2);
        assertThat(result.getOperator()).isEqualTo("+");
        assertThat(result.getNum2()).isEqualTo(3);
    }
}
