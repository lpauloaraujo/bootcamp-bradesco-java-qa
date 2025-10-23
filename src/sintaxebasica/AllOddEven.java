package sintaxebasica;

import java.util.Scanner;

public class AllOddEven {

    public void getOddAndEvenNumbers () {
        int firstNumber = readInteger("Enter the first number: ");
        int secondNumber = readInteger("Enter the second number: ");
        while (!checkIfBigger(firstNumber, secondNumber)) {
            System.out.println("The second number must be bigger than the first number.");
            firstNumber = readInteger("Enter the first number: ");
            secondNumber = readInteger("Enter the second number: ");
        }
        System.out.println(separateOddAndEvenNumbers(firstNumber, secondNumber));
    }

    private String separateOddAndEvenNumbers (int firstNumber, int secondNumber) {
        StringBuilder oddNumbersStringBuilder = new StringBuilder();
        StringBuilder evenNumbersStringBuilder = new StringBuilder();
        for (var i = secondNumber; i >= firstNumber; i--) {
            String suffix = (i == firstNumber || i == (firstNumber + 1)) ? "." : " | ";
            if (i % 2 != 0) oddNumbersStringBuilder.append(String.valueOf(i)).append(suffix);
            else evenNumbersStringBuilder.append(String.valueOf(i)).append(suffix);
        }
        String oddNumbers = oddNumbersStringBuilder.toString();
        String evenNumbers = evenNumbersStringBuilder.toString();
        return "Odd numbers: " + oddNumbers + "\n" + "Even numbers: " + evenNumbers;
    }

    private boolean checkIfBigger (int firstNumber, int secondNumber) {
        return secondNumber > firstNumber;
    }

    private int readInteger (String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("The value must be an integer.");
                scanner.nextLine();
            }
        }
    }
}
