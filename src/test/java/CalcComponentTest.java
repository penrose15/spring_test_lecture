import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalcComponentTest {
    @Test
    public void 덧셈_연산을_할_수_있다() {
        //do Something....
        int num1 = 1;
        int num2 = 2;

        CalcComponent component = new CalcComponent();
        int result = component.calc(num1, num2,"+");

        assertThat(3).isEqualTo(result);
    }
    @Test
    public void 뺄셈_연산을_할_수_있다() {
        //do Something....
        int num1 = 1;
        int num2 = 2;

        CalcComponent component = new CalcComponent();
        int result = component.calc(num1, num2,"-");

        assertThat(-1).isEqualTo(result);
    }
    @Test
    public void 곱셈_연산을_할_수_있다() {
        //do Something....
        int num1 = 1;
        int num2 = 2;

        CalcComponent component = new CalcComponent();
        int result = component.calc(num1, num2,"*");

        assertThat(2).isEqualTo(result);
    }
    @Test
    public void 나눗셈_연산을_할_수_있다() {
        //do Something....
        int num1 = 2;
        int num2 = 2;

        CalcComponent component = new CalcComponent();
        int result = component.calc(num1, num2,"/");

        assertThat(1).isEqualTo(result);
    }

    @Test
    public void 잘못된_예외시_예외처리() {
        //do Something....
        int num1 = 2;
        int num2 = 2;

        CalcComponent component = new CalcComponent();

        assertThatThrownBy(() -> component.calc(num1, num2,";"))
                .isInstanceOf(InvalidOperationException.class);



        int result = component.calc(num1, num2,"/");

    }
}
