public class InvalidOperationException extends RuntimeException {
    public InvalidOperationException() {
        super("invalid operator, you need to write one of these operators (+, -, *, /)");
    }
}
