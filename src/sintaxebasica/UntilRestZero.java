package sintaxebasica;

import java.util.Scanner;

public class UntilRestZero {

    public void readUntilRestZero () {
        int number = readInteger();
        while (true) {
           int newNumber = readInteger();
           if ((newNumber >= number) && (newNumber % number == 0)) break;
        }
    }

    private int readInteger () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer number: ");
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("The value must be an integer.");
                scanner.nextLine();
            }
        }
    }
}
