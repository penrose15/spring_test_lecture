import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalcRequestTest {

    @Test
    void 인풋_validationTest() {
        String[] input = new String[]{"1", "+", "2"};
        CalculatorRequest calculatorRequest = new CalculatorRequest(input);

        assertThat(calculatorRequest.getNum1()).isEqualTo(1);
        assertThat(calculatorRequest.getNum2()).isEqualTo(2);
        assertThat(calculatorRequest.getOperator()).isEqualTo("+");
    }

    @Test
    void 예외상황_테스트1() {
        String[] input = new String[]{"1", "+", "2","2"};

        assertThatThrownBy(() -> new CalculatorRequest(input))
                .isInstanceOf(BadRequestException.class);
    }

    @Test
    void 예외상황_테스트2() {
        String[] input = new String[]{"1", ";", "2"};

        assertThatThrownBy(() -> new CalculatorRequest(input))
                .isInstanceOf(BadRequestException.class);
    }
}
