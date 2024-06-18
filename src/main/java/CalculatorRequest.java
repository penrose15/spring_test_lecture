public class CalculatorRequest {
    private final int num1;
    private final int num2;
    private final String operator;

    public CalculatorRequest(String[] input) {
        if(input.length != 3 || validateOperator(input[1])) throw new BadRequestException();

        this.num1 = Integer.parseInt(input[0]);
        this.num2 = Integer.parseInt(input[2]);
        this.operator = input[1];
    }

    private boolean validateOperator(String operator) {
        return !(operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/"));
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
