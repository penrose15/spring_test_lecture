import java.util.Scanner;

public class CalculatorRequestReader {
    public CalculatorRequest readRequest() {
        System.out.println("enter the number (e.g 1 + 2)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        return new CalculatorRequest(input.split(" "));
    }
}
