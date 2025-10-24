package study;


public class Calculator {

    public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
        int result;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "%":
                result = number1 % number2;
                break;
            default:
                throw new WrongOperatorException("invalid operator: " + operator);
        }

        return result;
    }
}
