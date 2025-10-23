package sintaxebasica;

import java.util.Scanner;

public class MultiplicationTable {
    public void table () {
        int number = readInt();
        System.out.println(generateTable(number));
    }

    private int readInt () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer number: ");
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid value.");
                scanner.nextLine();
            }
        }
    }

    private String generateTable (int number) {
        StringBuilder table = new StringBuilder();
        for (var i = 1; i <= 10; i++) {
            String newLine = number + " x " + i + " = " + (number * i) + "\n";
            table.append(newLine);
        }
        return table.toString();
    }
}
