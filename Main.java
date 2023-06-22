import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
                System.out.println("Input:");
        String expression = scn.nextLine();
        String answer = calc(expression);
        System.out.println("Output:\n" + answer);
    }
    public static String calc(String input) {

        String exception = "throws Exception";
        Integer result = 0;

        String[] inputSplit = input.split(" ");

        if (inputSplit.length != 3) {
            return exception;
        }
        Integer firstNumber = 0;
        Integer secondNumber = 0;
        try {
            firstNumber = Integer.valueOf(inputSplit[0]);
            secondNumber = Integer.valueOf(inputSplit[2]);
        } catch (NumberFormatException e) {                           }
        if ((firstNumber < 1) || (firstNumber > 10) || (secondNumber < 1) || (secondNumber > 10)) {
            return exception;
        }

        String sign = inputSplit[1];
        switch (sign) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
            default -> {
                return exception;
            }
        }
        return result.toString();
    }
}