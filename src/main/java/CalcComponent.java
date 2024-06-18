public class CalcComponent {

    public int calc(int num1, int num2, String operator) {
        int ans = 0;
        switch (operator) {
            case "+" -> ans = num1 + num2;
            case "-" -> ans = num1 - num2;
            case "*" -> ans = num1 * num2;
            case "/" -> ans = num1 / num2;
            default -> throw new InvalidOperationException();
        }
        return ans;
    }
}
