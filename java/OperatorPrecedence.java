public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;       // Multiplication has higher precedence
        int result2 = (10 + 5) * 2;    // Parentheses change order

        System.out.println("10 + 5 * 2 = " + result);
        System.out.println("(10 + 5) * 2 = " + result2);
    }
}
