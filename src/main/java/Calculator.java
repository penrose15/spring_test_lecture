import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalculatorRequestReader reader = new CalculatorRequestReader();
        CalculatorRequest request = reader.readRequest();

        int num1 = request.getNum1();
        int num2 = request.getNum2();
        String operator = request.getOperator();

        CalcComponent component = new CalcComponent();
        int ans = component.calc(num1, num2, operator);

        System.out.println(ans);
    }
}
